package dev.howluma.outlawexpansion;

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Safe, opt-in event-based adjustments. Does not modify the original
 * vendor JAR, its private state, player balances, or player data.
 */
public final class OutlawExpansionPlugin extends JavaPlugin implements Listener, CommandExecutor {

    private Method placeholderMethod;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Plugin vendor = Bukkit.getPluginManager().getPlugin("OutlawSMP");
        if (vendor == null || !vendor.isEnabled()) {
            getLogger().warning("OutlawSMP was not found. Standalone TNT changes can still run.");
        } else {
            getLogger().info("Detected OutlawSMP v" + vendor.getPluginMeta().getVersion());
        }
        if (Bukkit.getPluginManager().isPluginEnabled("PlaceholderAPI")) {
            try {
                Class<?> apiClass = Class.forName("me.clip.placeholderapi.PlaceholderAPI");
                placeholderMethod = apiClass.getMethod("setPlaceholders", OfflinePlayer.class, String.class);
                getLogger().info("PlaceholderAPI bridge connected.");
            } catch (ReflectiveOperationException exception) {
                getLogger().warning("PlaceholderAPI is installed but its bridge could not be loaded: " + exception);
            }
        } else {
            getLogger().warning("PlaceholderAPI is absent; perk-dependent adjustments will not run.");
        }
        Bukkit.getPluginManager().registerEvents(this, this);
        Objects.requireNonNull(getCommand("outlawexpansion")).setExecutor(this);
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
        if (getConfig().getBoolean("tnt.enabled", true)) {
            applyTntMultiplier(event);
        }
        if (getConfig().getBoolean("perks.toughness.enabled", false)
                && event.getEntity() instanceof Player player
                && hasPerk(player, "toughness")) {
            double multiplier = getConfig().getDouble("perks.toughness.damage-multiplier", 0.975);
            if (Double.isFinite(multiplier) && multiplier >= 0 && multiplier <= 1) {
                event.setDamage(event.getDamage() * multiplier);
            }
        }
    }

    private void applyTntMultiplier(EntityDamageEvent event) {
        if (event.getCause() != EntityDamageEvent.DamageCause.BLOCK_EXPLOSION
                && event.getCause() != EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) {
            return;
        }

        Entity direct = event.getDamageSource().getDirectEntity();
        if (!(direct instanceof TNTPrimed) && event instanceof EntityDamageByEntityEvent byEntity) {
            direct = byEntity.getDamager();
        }
        if (!(direct instanceof TNTPrimed tnt)) {
            return;
        }

        Entity source = tnt.getSource();
        boolean selfIgnited = source instanceof Player
                && source.getUniqueId().equals(event.getEntity().getUniqueId());

        // The self-igniter factor is relative to vanilla, not multiplied by 1.25 first.
        double multiplier = selfIgnited
                ? getConfig().getDouble("tnt.igniter-damage-multiplier", 0.50)
                : getConfig().getDouble("tnt.other-damage-multiplier", 1.25);

        if (Double.isFinite(multiplier) && multiplier >= 0 && multiplier <= 10) {
            event.setDamage(event.getDamage() * multiplier);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onCrossbowFire(EntityShootBowEvent event) {
        if (!getConfig().getBoolean("perks.sharpshooter.enabled", false)) {
            return;
        }
        if (!(event.getEntity() instanceof Player player)) {
            return;
        }
        ItemStack weapon = event.getBow();
        if (weapon == null || weapon.getType() != Material.CROSSBOW || !hasPerk(player, "sharpshooter")) {
            return;
        }
        double multiplier = getConfig().getDouble("perks.sharpshooter.projectile-velocity-multiplier", 1.25);
        if (!Double.isFinite(multiplier) || multiplier < 1.0 || multiplier > 3.0) {
            return;
        }
        Entity projectile = event.getProjectile();
        projectile.setVelocity(projectile.getVelocity().multiply(multiplier));
    }

    private boolean hasPerk(Player player, String perkName) {
        return matchesPerk(resolvePlaceholder(player, "%outlawsmp_perk1%"), perkName)
                || matchesPerk(resolvePlaceholder(player, "%outlawsmp_perk2%"), perkName);
    }

    private boolean matchesPerk(String response, String perk) {
        if (response == null || response.startsWith("%outlawsmp_")) {
            return false;
        }
        String plain = ChatColor.stripColor(response);
        if (plain == null) {
            return false;
        }
        plain = plain.replaceAll("<[^>]*>", "").toLowerCase(Locale.ROOT);
        return plain.contains(perk.toLowerCase(Locale.ROOT));
    }

    private String resolvePlaceholder(Player player, String placeholder) {
        if (placeholderMethod == null) {
            return null;
        }
        try {
            Object result = placeholderMethod.invoke(null, player, placeholder);
            return result instanceof String ? (String) result : null;
        } catch (ReflectiveOperationException | RuntimeException exception) {
            getLogger().warning("Could not resolve " + placeholder + ": " + exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "OutlawExpansion config reloaded.");
            return true;
        }
        if (args.length == 1 && args[0].equalsIgnoreCase("status")) {
            Plugin original = Bukkit.getPluginManager().getPlugin("OutlawSMP");
            sender.sendMessage(ChatColor.GOLD + "OutlawExpansion test build");
            sender.sendMessage("OutlawSMP: " + (original != null && original.isEnabled()
                    ? original.getPluginMeta().getVersion() : "not active"));
            sender.sendMessage("PlaceholderAPI: " + (placeholderMethod == null ? "unavailable" : "connected"));
            sender.sendMessage("TNT scaling: " + getConfig().getBoolean("tnt.enabled", true));
            sender.sendMessage("Toughness addon: " + getConfig().getBoolean("perks.toughness.enabled", false));
            sender.sendMessage("Sharpshooter addon: " + getConfig().getBoolean("perks.sharpshooter.enabled", false));
            if (sender instanceof Player player) {
                sender.sendMessage("Equipped perk 1: " + resolvePlaceholder(player, "%outlawsmp_perk1%"));
                sender.sendMessage("Equipped perk 2: " + resolvePlaceholder(player, "%outlawsmp_perk2%"));
                sender.sendMessage("Equipped skill: " + resolvePlaceholder(player, "%outlawsmp_skill%"));
                sender.sendMessage("Current bounty: " + resolvePlaceholder(player, "%outlawsmp_bounty%"));
            }
            return true;
        }
        sender.sendMessage(ChatColor.YELLOW + "Usage: /" + label + " <status|reload>");
        return true;
    }
}
