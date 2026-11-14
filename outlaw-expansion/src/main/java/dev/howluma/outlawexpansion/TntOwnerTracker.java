package dev.howluma.outlawexpansion;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.TNTPrimeEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.projectiles.ProjectileSource;

/**
 * Attempts to preserve the original igniter UUID across block-TNT chains.
 * Dispensers, redstone, fire and external plugins can produce unowned TNT.
 * Unowned TNT continues using the normal 1.25x target multiplier.
 */
public final class TntOwnerTracker implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final NamespacedKey igniterKey;
    private final List<PendingPriming> recentlyPrimed = new ArrayList<>();

    public TntOwnerTracker(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
        igniterKey = new NamespacedKey(plugin, "tnt_original_igniter");
    }

    private boolean enabled() {
        return plugin.getConfig().getBoolean("tnt.track-igniter-across-chains", true);
    }

    public UUID owner(TNTPrimed tnt) {
        String stored = tnt.getPersistentDataContainer()
                .get(igniterKey, PersistentDataType.STRING);
        if (stored != null) {
            try {
                return UUID.fromString(stored);
            } catch (IllegalArgumentException ignored) {
                // Ignore another plugin's or corrupted legacy metadata.
            }
        }
        Entity vanillaSource = tnt.getSource();
        return vanillaSource instanceof Player player ? player.getUniqueId() : null;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onTntPrime(TNTPrimeEvent event) {
        if (!enabled()) return;
        Entity primer = event.getPrimingEntity();
        UUID owner = null;
        if (primer instanceof Player player) {
            owner = player.getUniqueId();
        } else if (primer instanceof TNTPrimed parent) {
            owner = owner(parent);
        } else if (primer instanceof Projectile projectile) {
            ProjectileSource source = projectile.getShooter();
            if (source instanceof Player player) owner = player.getUniqueId();
        }
        if (owner == null) return;
        recentlyPrimed.add(new PendingPriming(
                event.getBlock().getLocation().add(0.5, 0.5, 0.5),
                owner, System.currentTimeMillis()));
        cleanup();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onSpawn(EntitySpawnEvent event) {
        if (!enabled() || !(event.getEntity() instanceof TNTPrimed tnt)) return;

        UUID known = owner(tnt);
        if (known == null) {
            cleanup();
            Location spawned = tnt.getLocation();
            for (int i = recentlyPrimed.size() - 1; i >= 0; i--) {
                PendingPriming entry = recentlyPrimed.get(i);
                if (entry.location().getWorld() != null
                        && entry.location().getWorld().getUID().equals(spawned.getWorld().getUID())
                        && entry.location().distanceSquared(spawned) <= 2.25) {
                    known = entry.owner();
                    recentlyPrimed.remove(i);
                    break;
                }
            }
        }
        if (known != null) {
            tnt.getPersistentDataContainer()
                    .set(igniterKey, PersistentDataType.STRING, known.toString());
        }
    }

    private void cleanup() {
        long now = System.currentTimeMillis();
        recentlyPrimed.removeIf(p -> p.when() > now || now - p.when() > 2_000L);
        if (recentlyPrimed.size() > 200) {
            recentlyPrimed.subList(0, recentlyPrimed.size() - 200).clear();
        }
    }

    private record PendingPriming(Location location, UUID owner, long when) {}
}
