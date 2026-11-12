package dev.howluma.outlawexpansion;

import java.util.Locale;
import java.util.ArrayList;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/** A read-only visual design preview; intentionally not a shop. */
public final class CatalogPreview implements Listener {
    private final CatalogManager catalog;

    public CatalogPreview(CatalogManager catalog) {
        this.catalog = catalog;
    }

    public void open(Player player, String category) {
        String normalized = category.toLowerCase(Locale.ROOT);
        if (!normalized.equals("skills") && !normalized.equals("perks")) {
            player.sendMessage("Usage: /outlawexpansion preview <skills|perks>");
            return;
        }
        PreviewHolder holder = new PreviewHolder();
        Inventory inv = Bukkit.createInventory(holder, 27,
                Component.text("DRAFT - " + normalized.toUpperCase(Locale.ROOT), NamedTextColor.GOLD));
        holder.inventory = inv;
        int i = 0;
        for (String id : catalog.listIds(normalized)) {
            CatalogManager.CatalogEntry entry = catalog.lookup(normalized, id);
            if (entry == null || i >= 27) break;
            Material icon = Material.matchMaterial(entry.icon());
            if (icon == null || icon.isAir()) icon = Material.PAPER;
            ItemStack stack = new ItemStack(icon);
            ItemMeta meta = stack.getItemMeta();
            meta.displayName(Component.text(entry.name(), NamedTextColor.AQUA));
            ArrayList<Component> lore = new ArrayList<>();
            lore.add(Component.text("Implementation: " + entry.implementation(), NamedTextColor.DARK_GRAY));
            for (String line : entry.lore()) lore.add(Component.text(line, NamedTextColor.GRAY));
            lore.add(Component.text(entry.plannedPrice() < 0
                    ? "Planned price: not set" : "Planned price: " + entry.plannedPrice(), NamedTextColor.YELLOW));
            lore.add(Component.text("Preview only - cannot purchase", NamedTextColor.RED));
            meta.lore(lore);
            stack.setItemMeta(meta);
            inv.setItem(i++, stack);
        }
        player.openInventory(inv);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick(InventoryClickEvent event) {
        if (event.getView().getTopInventory().getHolder() instanceof PreviewHolder) {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDrag(InventoryDragEvent event) {
        if (event.getView().getTopInventory().getHolder() instanceof PreviewHolder) {
            event.setCancelled(true);
        }
    }

    private static final class PreviewHolder implements InventoryHolder {
        private Inventory inventory;

        @Override
        public Inventory getInventory() {
            return inventory;
        }
    }
}
