package dev.howluma.outlawexpansion;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Experimental replacement for Lifestealer's vendor Regeneration-on-hit.
 * The vendor's Regeneration application is used as the trigger that proves
 * the ability is active (merely owning Lifestealer is NOT sufficient).
 */
public final class LifestealerConversion implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final Map<UUID, PendingHit> pending = new HashMap<>();

    public LifestealerConversion(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onHit(EntityDamageByEntityEvent event) {
        if (!plugin.getConfig().getBoolean("skills.lifestealer.convert-regeneration", false)) return;
        if (!(event.getDamager() instanceof Player attacker)
                || !(event.getEntity() instanceof LivingEntity target)
                || !plugin.hasSkill(attacker, "lifestealer")) return;

        // Snapshot real health before damage is applied. Absorption shield damage
        // is excluded below by comparing the health value after the event.
        PendingHit hit = new PendingHit(event, target, target.getHealth());
        pending.put(attacker.getUniqueId(), hit);

        Bukkit.getScheduler().runTask(plugin, () -> {
            if (pending.get(attacker.getUniqueId()) != hit) return;
            pending.remove(attacker.getUniqueId());
            if (!hit.vendorRegenerationIntercepted || event.isCancelled()) return;

            double effective = event.getFinalDamage();
            if (!Double.isFinite(effective) || effective <= 0) return;
            double after = target.isDead() ? 0.0 : target.getHealth();
            if (attacker.isDead() || !attacker.isOnline()) return;
            double max = attacker.getMaxHealth();
            double heal = MechanicRules.lifestealHeal(hit.beforeHealth, after,
                    effective, attacker.getHealth(), max);
            if (heal <= 0) return;
            attacker.setHealth(Math.min(max, attacker.getHealth() + heal));
        });
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = false)
    public void onVendorRegeneration(EntityPotionEffectEvent event) {
        if (!plugin.getConfig().getBoolean("skills.lifestealer.convert-regeneration", false)) return;
        if (!(event.getEntity() instanceof Player attacker)
                || event.getModifiedType() != PotionEffectType.REGENERATION
                || event.getCause() != EntityPotionEffectEvent.Cause.PLUGIN) return;

        PendingHit hit = pending.get(attacker.getUniqueId());
        if (hit == null || !plugin.hasSkill(attacker, "lifestealer")) return;

        PotionEffect regen = event.getNewEffect();
        int configured = plugin.getConfig().getInt("skills.lifestealer.vendor-regen-ticks", 60);
        if (regen == null || regen.getAmplifier() != 0
                || Math.abs(regen.getDuration() - configured) > 1) return;

        // Only intercept precisely the vendor-like 60 tick Regeneration I
        // received during a hit. Other healing effects are left untouched.
        event.setCancelled(true);
        hit.vendorRegenerationIntercepted = true;
    }

    private static final class PendingHit {
        private final EntityDamageByEntityEvent damage;
        private final LivingEntity target;
        private final double beforeHealth;
        private boolean vendorRegenerationIntercepted;

        private PendingHit(EntityDamageByEntityEvent damage, LivingEntity target,
                           double beforeHealth) {
            this.damage = damage;
            this.target = target;
            this.beforeHealth = beforeHealth;
        }
    }
}
