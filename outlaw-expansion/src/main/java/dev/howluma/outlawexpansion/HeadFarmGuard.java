package dev.howluma.outlawexpansion;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

/**
 * Stops repeated PLAYER_HEAD drops from farming the same victim.
 *
 * This guards both PlayerDeathEvent drops and entity drops spawned immediately
 * at a death location by other plugins. It is not a generic item-dupe detector.
 * The original sheriff's redemption logic must be audited separately.
 */
public final class HeadFarmGuard implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final File file;
    private final Map<Pair, Long> killerVictim = new HashMap<>();
    private final Map<UUID, Long> victimLast = new HashMap<>();
    private final Map<UUID, PendingDeath> pending = new HashMap<>();

    public HeadFarmGuard(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), "head-guard.yml");
        load();
    }

    private boolean active() {
        return plugin.getConfig().getBoolean("heads.anti-farm.enabled", true);
    }

    private long pairCooldown() {
        return Math.max(0L, plugin.getConfig().getLong(
                "heads.anti-farm.killer-victim-cooldown-minutes", 60L)) * 60_000L;
    }

    private long victimCooldown() {
        return Math.max(0L, plugin.getConfig().getLong(
                "heads.anti-farm.victim-cooldown-minutes", 10L)) * 60_000L;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onDeathBegin(PlayerDeathEvent event) {
        if (!active()) return;

        Player victim = event.getEntity();
        Player killer = victim.getKiller();
        if (killer == null || killer.getUniqueId().equals(victim.getUniqueId())) return;

        UUID victimId = victim.getUniqueId();
        UUID killerId = killer.getUniqueId();
        Pair key = new Pair(killerId, victimId);
        long now = System.currentTimeMillis();

        boolean pairBlocked = MechanicRules.withinCooldown(now, killerVictim.get(key), pairCooldown());
        boolean victimBlocked = MechanicRules.withinCooldown(now, victimLast.get(victimId), victimCooldown());
        boolean denied = pairBlocked || victimBlocked;

        if (!denied) {
            killerVictim.put(key, now);
            victimLast.put(victimId, now);
            save();
        }

        pending.put(victimId, new PendingDeath(victim.getLocation().clone(), now, denied));
        // Monitor only the immediate death-spawn window. No long-lived world scan.
        Bukkit.getScheduler().runTaskLater(plugin, () -> pending.remove(victimId), 5L);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeathDrops(PlayerDeathEvent event) {
        if (!active()) return;
        PendingDeath recent = pending.get(event.getEntity().getUniqueId());
        if (recent != null && recent.denied()) {
            event.getDrops().removeIf(item -> item.getType() == Material.PLAYER_HEAD);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onItemSpawn(ItemSpawnEvent event) {
        if (!active()) return;
        Item drop = event.getEntity();
        if (drop.getItemStack().getType() != Material.PLAYER_HEAD) return;

        long now = System.currentTimeMillis();
        for (PendingDeath death : pending.values()) {
            if (!death.denied() || now - death.when() > 2_000L) continue;
            Location location = death.location();
            if (location.getWorld() != null
                    && drop.getWorld().getUID().equals(location.getWorld().getUID())
                    && drop.getLocation().distanceSquared(location) <= 9.0) {
                event.setCancelled(true);
                return;
            }
        }
    }

    public int recordCount() {
        return killerVictim.size();
    }

    public void shutdown() {
        save();
        pending.clear();
    }

    private void load() {
        if (!file.exists()) return;
        YamlConfiguration yaml = YamlConfiguration.loadConfiguration(file);
        ConfigurationSection pairs = yaml.getConfigurationSection("killer-victim");
        if (pairs != null) {
            for (String key : pairs.getKeys(false)) {
                String[] parts = key.split("_", 2);
                if (parts.length != 2) continue;
                try {
                    killerVictim.put(new Pair(UUID.fromString(parts[0]),
                            UUID.fromString(parts[1])), pairs.getLong(key));
                } catch (IllegalArgumentException ignored) {
                    // Ignore a malformed historical record.
                }
            }
        }
        ConfigurationSection victims = yaml.getConfigurationSection("victim");
        if (victims != null) {
            for (String key : victims.getKeys(false)) {
                try {
                    victimLast.put(UUID.fromString(key), victims.getLong(key));
                } catch (IllegalArgumentException ignored) {
                    // Ignore a malformed historical record.
                }
            }
        }
    }

    private void save() {
        long now = System.currentTimeMillis();
        long retain = Math.max(pairCooldown(), victimCooldown()) + 86_400_000L;
        killerVictim.entrySet().removeIf(e -> e.getValue() < now && now - e.getValue() > retain);
        victimLast.entrySet().removeIf(e -> e.getValue() > now || now - e.getValue() > retain);

        YamlConfiguration yaml = new YamlConfiguration();
        for (Map.Entry<Pair, Long> entry : killerVictim.entrySet()) {
            Pair pair = entry.getKey();
            yaml.set("killer-victim." + pair.killer() + "_" + pair.victim(), entry.getValue());
        }
        for (Map.Entry<UUID, Long> entry : victimLast.entrySet()) {
            yaml.set("victim." + entry.getKey(), entry.getValue());
        }
        try {
            yaml.save(file);
        } catch (IOException exception) {
            plugin.getLogger().severe("Could not persist head anti-farm cooldowns: "
                    + exception.getMessage());
        }
    }

    private record Pair(UUID killer, UUID victim) {}

    private record PendingDeath(Location location, long when, boolean denied) {}
}
