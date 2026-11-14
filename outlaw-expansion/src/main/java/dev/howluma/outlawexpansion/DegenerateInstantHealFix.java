package dev.howluma.outlawexpansion;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

/**
 * Opt-in escape hatch for Instant Health potions whose MAGIC healing is
 * cancelled by the original Degenerate effect. Does not reactivate natural
 * regeneration or heal for a guessed amount.
 */
public final class DegenerateInstantHealFix implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final Map<UUID, Long> recentHealingPotions = new HashMap<>();

    public DegenerateInstantHealFix(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
    }

    private boolean active() {
        return plugin.getConfig().getBoolean(
                "skills.degenerate.restore-instant-health-potions", false);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onSplash(PotionSplashEvent event) {
        if (!active() || !isInstantHealthPotion(event.getPotion().getItem())) return;
        for (LivingEntity entity : event.getAffectedEntities()) {
            if (entity instanceof Player player && event.getIntensity(entity) > 0) {
                remember(player);
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onDrink(PlayerItemConsumeEvent event) {
        if (active() && isInstantHealthPotion(event.getItem())) {
            remember(event.getPlayer());
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = false)
    public void onHealing(EntityRegainHealthEvent event) {
        if (!active() || !event.isCancelled()
                || event.getRegainReason() != EntityRegainHealthEvent.RegainReason.MAGIC
                || !(event.getEntity() instanceof Player player)) return;

        Long last = recentHealingPotions.get(player.getUniqueId());
        long now = System.currentTimeMillis();
        if (last != null && now >= last && now - last <= 2_500) {
            // Restore only a documented instant-health potion's MAGIC heal.
            // If another plugin cancels this event after HIGHEST, the fix will
            // not win; capture a diagnostic trace for that case.
            event.setCancelled(false);
            recentHealingPotions.remove(player.getUniqueId());
        }
    }

    private void remember(Player player) {
        long now = System.currentTimeMillis();
        recentHealingPotions.entrySet().removeIf(e -> e.getValue() > now
                || now - e.getValue() > 5_000L);
        recentHealingPotions.put(player.getUniqueId(), now);
    }

    private boolean isInstantHealthPotion(ItemStack item) {
        if (item == null) return false;
        ItemMeta meta = item.getItemMeta();
        if (!(meta instanceof PotionMeta potion)) return false;
        PotionType type = potion.getBasePotionType();
        if (type == PotionType.HEALING || type == PotionType.STRONG_HEALING) return true;
        for (PotionEffect effect : potion.getAllEffects()) {
            if (effect.getType() == PotionEffectType.INSTANT_HEALTH) return true;
        }
        return false;
    }
}
