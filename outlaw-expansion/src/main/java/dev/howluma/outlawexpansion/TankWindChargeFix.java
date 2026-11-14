package dev.howluma.outlawexpansion;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.WindCharge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityKnockbackByEntityEvent;

/**
 * Opt-in compatibility fix when a vendor ability cancels wind-charge
 * knockback. Still requires live testing; may not cover all explosion paths.
 */
public final class TankWindChargeFix implements Listener {
    private final OutlawExpansionPlugin plugin;

    public TankWindChargeFix(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = false)
    public void onKnockback(EntityKnockbackByEntityEvent event) {
        if (!plugin.getConfig().getBoolean("skills.tank.wind-charge-knockback-fix", false)) return;
        if (!(event.getEntity() instanceof Player player)
                || !plugin.hasSkill(player, "tank")) return;

        Entity source = event.getSourceEntity();
        // Player-thrown wind charges (not Breeze projectiles).
        if (!(source instanceof WindCharge)) return;

        // Preserve the event's original knockback vector; do not invent force.
        // A later plugin can still cancel, hence server-side validation.
        event.setCancelled(false);
    }
}
