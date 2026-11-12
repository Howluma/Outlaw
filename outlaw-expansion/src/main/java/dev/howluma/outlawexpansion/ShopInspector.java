package dev.howluma.outlawexpansion;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

/** A user-initiated, one-shot store GUI inspection tool for test servers. */
public final class ShopInspector implements Listener {
    private final JavaPlugin plugin;
    private final Set<UUID> waiting = new HashSet<>();

    public ShopInspector(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void arm(Player player) {
        waiting.add(player.getUniqueId());
    }

    public void cancel(Player player) {
        waiting.remove(player.getUniqueId());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryOpen(InventoryOpenEvent event) {
        if (!(event.getPlayer() instanceof Player player)
                || !waiting.contains(player.getUniqueId())) return;

        String title = plain(event.getView().title());
        String lower = title.toLowerCase(Locale.ROOT);
        // Never inspect random containers / player inventories.
        if (!lower.contains("skill") && !lower.contains("perk")
                && !lower.contains("outlaw") && !lower.contains("shop")
                && !lower.contains("store")) return;

        waiting.remove(player.getUniqueId());
        Bukkit.getScheduler().runTask(plugin, () -> {
            if (!player.isOnline()) return;
            Inventory inv = player.getOpenInventory().getTopInventory();
            int slots = Math.min(inv.getSize(), 54);
            plugin.getLogger().info("=== OUTLAW SHOP: " + clean(title)
                    + " (" + slots + " slots) ===");
            for (int slot = 0; slot < slots; slot++) {
                ItemStack stack = inv.getItem(slot);
                if (stack == null || stack.getType().isAir()) continue;
                ItemMeta meta = stack.getItemMeta();
                String display = meta == null || meta.displayName() == null
                        ? stack.getType().name() : plain(meta.displayName());
                plugin.getLogger().info("slot " + slot + ": " + stack.getType()
                        + " / " + clean(display));
                if (meta != null && meta.lore() != null) {
                    int count = 0;
                    for (Component line : meta.lore()) {
                        if (++count > 8) break;
                        plugin.getLogger().info("  lore: " + clean(plain(line)));
                    }
                }
            }
            plugin.getLogger().info("=== END OUTLAW SHOP ===");
        });
    }

    private static String plain(Component component) {
        return PlainTextComponentSerializer.plainText().serialize(component);
    }

    private static String clean(String value) {
        String scrubbed = value.replaceAll("[\\r\\n\\t]", " ");
        return scrubbed.substring(0, Math.min(scrubbed.length(), 120));
    }
}
