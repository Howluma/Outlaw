package dev.howluma.outlawexpansion;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

/**
 * Blacksmith-specific new recipes, independent of the vendor's internal
 * recipe registrar. Disabled by default until tested with its crafting UI.
 */
public final class BlacksmithRecipeManager implements Listener {
    private final OutlawExpansionPlugin plugin;
    private final NamespacedKey webKey;
    private final NamespacedKey breezeKey;
    private final Set<NamespacedKey> registered = new HashSet<>();

    public BlacksmithRecipeManager(OutlawExpansionPlugin plugin) {
        this.plugin = plugin;
        webKey = new NamespacedKey(plugin, "blacksmith_cobweb_dupe");
        breezeKey = new NamespacedKey(plugin, "blacksmith_breeze_rod");
    }

    public void reload() {
        unregister();
        if (!plugin.getConfig().getBoolean("perks.blacksmith.new-recipes-enabled", false)) {
            plugin.getLogger().info("Custom Blacksmith recipes are disabled (test-server default).");
            return;
        }

        ShapelessRecipe web = new ShapelessRecipe(webKey, new ItemStack(Material.COBWEB, 2));
        web.addIngredient(Material.COBWEB);
        if (Bukkit.addRecipe(web)) registered.add(webKey);
        else plugin.getLogger().warning("Could not register Blacksmith cobweb duplication recipe.");

        ShapedRecipe breeze = new ShapedRecipe(breezeKey, new ItemStack(Material.BREEZE_ROD));
        breeze.shape("NNN", "NSN", "NNN");
        breeze.setIngredient('N', Material.IRON_NUGGET);
        breeze.setIngredient('S', Material.STICK);
        if (Bukkit.addRecipe(breeze)) registered.add(breezeKey);
        else plugin.getLogger().warning("Could not register Blacksmith breeze rod recipe.");

        plugin.getLogger().info("Registered " + registered.size()
                + " opt-in Blacksmith recipes (4-gold apple remains in original config).");
    }

    public void unregister() {
        for (NamespacedKey key : registered) {
            Bukkit.removeRecipe(key);
        }
        registered.clear();
    }

    private boolean isOurRecipe(Recipe recipe) {
        return recipe instanceof Keyed keyed && registered.contains(keyed.getKey());
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPrepare(PrepareItemCraftEvent event) {
        if (!isOurRecipe(event.getRecipe())) return;
        if (!(event.getView().getPlayer() instanceof Player player)
                || !plugin.hasPerk(player, "blacksmith")) {
            event.getInventory().setResult(new ItemStack(Material.AIR));
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onCraft(CraftItemEvent event) {
        if (!isOurRecipe(event.getRecipe())) return;
        if (!(event.getWhoClicked() instanceof Player player)
                || !plugin.hasPerk(player, "blacksmith")) {
            event.setCancelled(true);
        }
    }
}
