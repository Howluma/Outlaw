package dev.howluma.outlawexpansion;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/** Draft content and price catalog. Does not modify vendor purchases. */
public final class CatalogManager {
    private final JavaPlugin plugin;
    private final File file;
    private YamlConfiguration config;

    public CatalogManager(JavaPlugin plugin) {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), "catalog.yml");
        reload();
    }

    public void reload() {
        if (!file.exists()) {
            plugin.saveResource("catalog.yml", false);
        }
        config = YamlConfiguration.loadConfiguration(file);
        plugin.getLogger().info("Catalog loaded: " + count("skills")
                + " skills and " + count("perks") + " perks (preview only).");
    }

    public int count(String type) {
        ConfigurationSection s = config.getConfigurationSection(type);
        return s == null ? 0 : s.getKeys(false).size();
    }

    public List<String> listIds(String type) {
        ConfigurationSection s = config.getConfigurationSection(type);
        return s == null ? List.of() : new ArrayList<>(s.getKeys(false));
    }

    public CatalogEntry lookup(String type, String id) {
        if (!"skills".equals(type) && !"perks".equals(type)) return null;
        ConfigurationSection entry = config.getConfigurationSection(
                type + "." + id.toLowerCase(Locale.ROOT));
        if (entry == null) return null;
        double price = entry.getDouble("planned-price", -1);
        if (!Double.isFinite(price) || price < -1) price = -1;
        return new CatalogEntry(
                entry.getString("display-name", id), entry.getInt("tier", 0),
                price, entry.getString("implementation", "needs-verification"),
                entry.getString("icon", "PAPER"),
                List.copyOf(entry.getStringList("lore")));
    }

    public record CatalogEntry(String name, int tier, double plannedPrice,
                               String implementation, String icon, List<String> lore) {}
}
