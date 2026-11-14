package dev.howluma.outlawexpansion;

import java.util.Objects;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

/**
 * Temporary +1 Quick Charge while a perk-owner holds a crossbow.
 *
 * Stores the ORIGINAL enchantment level in item PDC so a crash/restart can
 * restore items on next login. Not active until the vendor's fixed-level
 * Quickdraw effect is confirmed disabled (avoids enchantment ping-pong).
 */
public final class QuickdrawBoost implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final NamespacedKey originalKey;
    private final NamespacedKey appliedKey;
    private boolean warnedAboutVendor;

    public QuickdrawBoost(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
        this.originalKey = new NamespacedKey(plugin, "quickdraw_original");
        this.appliedKey = new NamespacedKey(plugin, "quickdraw_applied");
    }

    public void start() {
        Bukkit.getScheduler().runTaskTimer(plugin, this::tick, 1L, 2L);
    }

    public void stop() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            restoreInventory(player);
        }
    }

    private boolean active() {
        boolean enabled = plugin.getConfig().getBoolean("perks.quickdraw.enabled", false);
        boolean neutralized = plugin.getConfig().getBoolean(
                "perks.quickdraw.vendor-fixed-level-disabled-confirmed", false);
        if (enabled && !neutralized && !warnedAboutVendor) {
            plugin.getLogger().warning("Quickdraw enabled but original fixed-level"
                    + " effect is not marked as disabled. Holding boost inactive.");
            warnedAboutVendor = true;
        }
        return enabled && neutralized;
    }

    private void tick() {
        boolean enabled = active();
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerInventory inventory = player.getInventory();
            boolean perk = enabled && plugin.hasPerk(player, "quickdraw");
            int held = inventory.getHeldItemSlot();

            for (int slot = 0; slot < 36; slot++) {
                ItemStack stack = inventory.getItem(slot);
                if (stack == null) continue;
                boolean changed = perk && slot == held
                        ? boost(stack) : restore(stack);
                if (changed) inventory.setItem(slot, stack);
            }
            ItemStack offhand = inventory.getItemInOffHand();
            if (offhand.getType() != Material.AIR) {
                boolean changed = perk ? boost(offhand) : restore(offhand);
                if (changed) inventory.setItemInOffHand(offhand);
            }
        }
    }

    private boolean boost(ItemStack stack) {
        if (stack.getType() != Material.CROSSBOW) return restore(stack);
        ItemMeta meta = stack.getItemMeta();
        if (meta == null) return false;

        PersistentDataContainer tags = meta.getPersistentDataContainer();
        Integer original = tags.get(originalKey, PersistentDataType.INTEGER);
        Integer expected = tags.get(appliedKey, PersistentDataType.INTEGER);
        int current = meta.getEnchantLevel(Enchantment.QUICK_CHARGE);

        if (original == null) {
            original = current;
            int boosted = MechanicRules.boostedQuickCharge(original);
            if (boosted == original) return false;
            tags.set(originalKey, PersistentDataType.INTEGER, original);
            tags.set(appliedKey, PersistentDataType.INTEGER, boosted);
            meta.removeEnchant(Enchantment.QUICK_CHARGE);
            meta.addEnchant(Enchantment.QUICK_CHARGE, boosted, true);
            stack.setItemMeta(meta);
            return true;
        }

        // If another plugin changed the enchant while this item was boosted,
        // restore the saved level rather than repeatedly fighting it.
        if (expected == null || current != expected || original < 0 || original > 10) {
            return restore(stack);
        }
        return false;
    }

    private boolean restore(ItemStack stack) {
        ItemMeta meta = stack.getItemMeta();
        if (meta == null) return false;
        PersistentDataContainer tags = meta.getPersistentDataContainer();
        Integer original = tags.get(originalKey, PersistentDataType.INTEGER);
        if (original == null) return false;

        meta.removeEnchant(Enchantment.QUICK_CHARGE);
        if (original > 0 && original <= 10) {
            meta.addEnchant(Enchantment.QUICK_CHARGE, original, true);
        }
        tags.remove(originalKey);
        tags.remove(appliedKey);
        stack.setItemMeta(meta);
        return true;
    }

    private void restoreInventory(Player player) {
        PlayerInventory inventory = player.getInventory();
        for (int slot = 0; slot < 36; slot++) {
            ItemStack stack = inventory.getItem(slot);
            if (stack != null && restore(stack)) inventory.setItem(slot, stack);
        }
        ItemStack off = inventory.getItemInOffHand();
        if (off != null && restore(off)) inventory.setItemInOffHand(off);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onInventoryClick(InventoryClickEvent event) {
        // Clean metadata before moving into containers, anvils, or other GUIs.
        ItemStack clicked = event.getCurrentItem();
        if (clicked != null && restore(clicked)) event.setCurrentItem(clicked);
        ItemStack cursor = event.getCursor();
        if (cursor != null && restore(cursor)) event.setCursor(cursor);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onDrop(PlayerDropItemEvent event) {
        ItemStack stack = event.getItemDrop().getItemStack();
        if (restore(stack)) event.getItemDrop().setItemStack(stack);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSwap(PlayerSwapHandItemsEvent event) {
        ItemStack main = event.getMainHandItem();
        if (main != null && restore(main)) event.setMainHandItem(main);
        ItemStack off = event.getOffHandItem();
        if (off != null && restore(off)) event.setOffHandItem(off);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeath(PlayerDeathEvent event) {
        for (ItemStack stack : event.getDrops()) {
            if (stack != null) restore(stack);
        }
        restoreInventory(event.getEntity());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        restoreInventory(event.getPlayer());
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        // Clean tagged items from an unclean previous shutdown on first login.
        Bukkit.getScheduler().runTask(plugin, () -> {
            if (event.getPlayer().isOnline()) restoreInventory(event.getPlayer());
        });
    }
}
