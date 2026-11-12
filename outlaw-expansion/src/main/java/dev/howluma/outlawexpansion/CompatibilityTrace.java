package dev.howluma.outlawexpansion;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityKnockbackByEntityEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Small, privacy-conscious event trace to identify vendor event interference.
 * Activated manually for 60 seconds by an admin, max 120 console records.
 */
public final class CompatibilityTrace implements Listener {
    private final OutlawExpansionPlugin plugin;
    private UUID target;
    private long until;
    private int entries;
    private int generation;

    public CompatibilityTrace(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
    }

    public void start(Player player) {
        target = player.getUniqueId();
        until = System.currentTimeMillis() + 60_000L;
        entries = 0;
        final int id = ++generation;
        plugin.getLogger().info("[trace] START 60 seconds; event types only, no names or UUIDs.");
        player.sendMessage("Outlaw event trace active for 60 seconds. Your mechanics will be logged to console without your identity.");
        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            if (generation == id) stop();
        }, 20L * 60L);
    }

    public void stop() {
        if (target != null) {
            plugin.getLogger().info("[trace] END; captured " + entries + " event records.");
        }
        target = null;
        until = 0;
        ++generation;
    }

    public boolean isTracing() {
        return target != null && System.currentTimeMillis() <= until;
    }

    private boolean matches(Entity entity) {
        return entity instanceof Player player && isTracing()
                && player.getUniqueId().equals(target);
    }

    private void log(String line) {
        if (!isTracing()) return;
        if (entries >= 120) {
            plugin.getLogger().warning("[trace] Record cap reached. Trace stopped.");
            stop();
            return;
        }
        entries++;
        plugin.getLogger().info("[trace] " + line);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
    public void onHealing(EntityRegainHealthEvent event) {
        if (matches(event.getEntity())) {
            log("heal reason=" + event.getRegainReason()
                    + " amount=" + event.getAmount()
                    + " cancelled=" + event.isCancelled());
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
    public void onPotion(EntityPotionEffectEvent event) {
        if (!matches(event.getEntity())) return;
        String effect = String.valueOf(event.getModifiedType());
        if (!effect.contains("speed") && !effect.contains("regeneration")
                && !effect.contains("slowness") && !effect.contains("weakness")
                && !effect.contains("poison") && !effect.contains("instant_health")) {
            return;
        }
        log("potion type=" + effect + " cause=" + event.getCause()
                + " action=" + event.getAction() + " cancelled=" + event.isCancelled()
                + " newTicks=" + (event.getNewEffect() == null
                ? 0 : event.getNewEffect().getDuration()));
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
    public void onKnockback(EntityKnockbackByEntityEvent event) {
        if (!matches(event.getEntity())) return;
        log("knockback source=" + event.getSourceEntity().getType()
                + " force=" + event.getForce() + " cancelled=" + event.isCancelled());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = false)
    public void onDamage(EntityDamageByEntityEvent event) {
        if (!matches(event.getDamager()) && !matches(event.getEntity())) return;
        log("damage cause=" + event.getCause() + " final=" + event.getFinalDamage()
                + " cancelled=" + event.isCancelled());
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        if (matches(event.getPlayer())) stop();
    }
}
