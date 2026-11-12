package dev.howluma.outlawexpansion;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
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
    private CatalogManager catalog;
    private CatalogPreview preview;
    private ShopInspector inspector;
    private BlacksmithRecipeManager blacksmithRecipes;
    private HeadFarmGuard headFarmGuard;
    private QuickdrawBoost quickdrawBoost;
    private TankWindChargeFix tankWindChargeFix;
    private LifestealerConversion lifestealerConversion;
    private NamespacedKey swiftModifierKey;
    private final Map<UUID, Integer> swiftGenerations = new HashMap<>();
    private int swiftGeneration;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        catalog = new CatalogManager(this);
        preview = new CatalogPreview(catalog);
        inspector = new ShopInspector(this);
        blacksmithRecipes = new BlacksmithRecipeManager(this);
        headFarmGuard = new HeadFarmGuard(this);
        quickdrawBoost = new QuickdrawBoost(this);
        tankWindChargeFix = new TankWindChargeFix(this);
        lifestealerConversion = new LifestealerConversion(this);
        swiftModifierKey = new NamespacedKey(this, "swift_speed_ii");
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
        Bukkit.getPluginManager().registerEvents(inspector, this);
        Bukkit.getPluginManager().registerEvents(preview, this);
        Bukkit.getPluginManager().registerEvents(blacksmithRecipes, this);
        Bukkit.getPluginManager().registerEvents(headFarmGuard, this);
        Bukkit.getPluginManager().registerEvents(quickdrawBoost, this);
        Bukkit.getPluginManager().registerEvents(tankWindChargeFix, this);
        Bukkit.getPluginManager().registerEvents(lifestealerConversion, this);
        quickdrawBoost.start();
        blacksmithRecipes.reload();
        Objects.requireNonNull(getCommand("outlawexpansion")).setExecutor(this);
    }

    @Override
    public void onDisable() {
        if (blacksmithRecipes != null) blacksmithRecipes.unregister();
        if (headFarmGuard != null) headFarmGuard.shutdown();
        if (quickdrawBoost != null) quickdrawBoost.stop();
        for (Player player : Bukkit.getOnlinePlayers()) {
            removeSwiftModifier(player);
        }
        swiftGenerations.clear();
    }

    /**
     * Convert only the vendor-applied Swift Speed II potion effect into
     * a non-persistent movement-speed attribute modifier.
     * Other plugin/potion/beacon effects are intentionally left alone.
     */
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onSwiftPotionEffect(EntityPotionEffectEvent event) {
        if (!getConfig().getBoolean("skills.swift.enabled", false)) {
            return;
        }
        if (!(event.getEntity() instanceof Player player)
                || event.getModifiedType() != PotionEffectType.SPEED
                || event.getCause() != EntityPotionEffectEvent.Cause.PLUGIN
                || !matchesSkill(resolvePlaceholder(player, "%outlawsmp_skill%"), "swift")) {
            return;
        }
        PotionEffect incoming = event.getNewEffect();
        int expectedTicks = getConfig().getInt("skills.swift.duration-seconds", 10) * 20;
        if (incoming == null || incoming.getAmplifier() != 1 || expectedTicks <= 0
                || Math.abs(incoming.getDuration() - expectedTicks) > 20) {
            return;
        }
        AttributeInstance speed = player.getAttribute(Attribute.MOVEMENT_SPEED);
        if (speed == null) {
            return;
        }
        event.setCancelled(true);
        removeSwiftModifier(player);
        swiftGenerations.put(player.getUniqueId(), ++swiftGeneration);
        int activation = swiftGeneration;
        // Speed II = 40% increased movement speed, without a potion effect.
        speed.addTransientModifier(new AttributeModifier(
                swiftModifierKey, 0.4, AttributeModifier.Operation.MULTIPLY_SCALAR_1));
        Bukkit.getScheduler().runTaskLater(this, () -> {
            if (Objects.equals(swiftGenerations.get(player.getUniqueId()), activation)) {
                swiftGenerations.remove(player.getUniqueId());
                removeSwiftModifier(player);
            }
        }, incoming.getDuration());
    }

    @EventHandler
    public void onSwiftLogout(PlayerQuitEvent event) {
        swiftGenerations.remove(event.getPlayer().getUniqueId());
        removeSwiftModifier(event.getPlayer());
    }

    @EventHandler
    public void onSwiftDeath(PlayerDeathEvent event) {
        swiftGenerations.remove(event.getEntity().getUniqueId());
        removeSwiftModifier(event.getEntity());
    }

    private void removeSwiftModifier(Player player) {
        if (swiftModifierKey == null) {
            return;
        }
        AttributeInstance speed = player.getAttribute(Attribute.MOVEMENT_SPEED);
        if (speed != null && speed.getModifier(swiftModifierKey) != null) {
            speed.removeModifier(swiftModifierKey);
        }
    }

    public boolean hasSkill(Player player, String skillName) {
        return matchesSkill(resolvePlaceholder(player, "%outlawsmp_skill%"), skillName);
    }

    private boolean matchesSkill(String response, String expectedSkill) {
        return matchesPerk(response, expectedSkill);
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
            event.setDamage(MechanicRules.tntDamage(event.getDamage(),
                    getConfig().getDouble("tnt.other-damage-multiplier", 1.25),
                    getConfig().getDouble("tnt.igniter-damage-multiplier", 0.50),
                    selfIgnited));
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

    boolean hasPerk(Player player, String perkName) {
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
            catalog.reload();
            blacksmithRecipes.reload();
            sender.sendMessage(ChatColor.GREEN + "OutlawExpansion config and draft catalog reloaded.");
            return true;
        }
        if (args.length >= 1 && args[0].equalsIgnoreCase("preview")) {
            if (!(sender instanceof Player player)) {
                sender.sendMessage("Preview requires an in-game admin.");
                return true;
            }
            if (args.length != 2) {
                sender.sendMessage(ChatColor.YELLOW + "Usage: /outlawexpansion preview <skills|perks>");
                return true;
            }
            preview.open(player, args[1]);
            return true;
        }
        if (args.length >= 1 && args[0].equalsIgnoreCase("inspect")) {
            if (!(sender instanceof Player player)) {
                sender.sendMessage("Use this command in game as an admin.");
                return true;
            }
            if (args.length == 2 && args[1].equalsIgnoreCase("on")) {
                inspector.arm(player);
                sender.sendMessage(ChatColor.GREEN + "Open the original skills/perks shop now. One safe GUI snapshot will be written to console.");
            } else {
                inspector.cancel(player);
                sender.sendMessage(ChatColor.YELLOW + "Shop inspection disabled.");
            }
            return true;
        }
        if (args.length >= 1 && args[0].equalsIgnoreCase("catalog")) {
            if (args.length == 1) {
                sender.sendMessage(ChatColor.GOLD + "Editable DRAFT catalog: " + catalog.count("skills")
                        + " skills and " + catalog.count("perks") + " perks.");
                sender.sendMessage(ChatColor.YELLOW + "/outlawexpansion catalog skill <id>");
                sender.sendMessage(ChatColor.YELLOW + "/outlawexpansion catalog perk <id>");
                sender.sendMessage(ChatColor.GRAY + "Planned prices and descriptions are NOT applied to the vendor shop yet.");
                return true;
            }
            String type = args[1].equalsIgnoreCase("skill") || args[1].equalsIgnoreCase("skills")
                    ? "skills" : (args[1].equalsIgnoreCase("perk") || args[1].equalsIgnoreCase("perks")
                    ? "perks" : "");
            if (type.isEmpty()) {
                sender.sendMessage(ChatColor.RED + "Type must be skill or perk.");
                return true;
            }
            if (args.length == 2) {
                sender.sendMessage(ChatColor.GOLD + type + ": " + String.join(", ", catalog.listIds(type)));
                return true;
            }
            CatalogManager.CatalogEntry entry = catalog.lookup(type, args[2]);
            if (entry == null) {
                sender.sendMessage(ChatColor.RED + "Unknown catalog entry.");
                return true;
            }
            sender.sendMessage(ChatColor.GOLD + "[DRAFT] " + entry.name());
            if (entry.tier() > 0) sender.sendMessage("Tier: " + entry.tier());
            sender.sendMessage("Planned price: " + (entry.plannedPrice() < 0
                    ? "unchanged/unset" : String.valueOf(entry.plannedPrice())));
            sender.sendMessage("Implementation: " + entry.implementation());
            for (String line : entry.lore()) sender.sendMessage(ChatColor.GRAY + "- " + line);
            sender.sendMessage(ChatColor.YELLOW + "Preview only; vendor prices and lore are not modified.");
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
            sender.sendMessage("Swift attribute addon: " + getConfig().getBoolean("skills.swift.enabled", false));
            sender.sendMessage("Blacksmith addon recipes: " + getConfig().getBoolean("perks.blacksmith.new-recipes-enabled", false));
            sender.sendMessage("Head farming guard: " + getConfig().getBoolean("heads.anti-farm.enabled", true));
            sender.sendMessage("Quickdraw boost: " + getConfig().getBoolean("perks.quickdraw.enabled", false));
            sender.sendMessage("Tank wind charge fix: " + getConfig().getBoolean("skills.tank.wind-charge-knockback-fix", false));
            sender.sendMessage("Lifestealer health conversion: " + getConfig().getBoolean("skills.lifestealer.convert-regeneration", false));
            sender.sendMessage("Draft catalog entries: " + catalog.count("skills") + " skills, "
                    + catalog.count("perks") + " perks (preview only)");
            if (sender instanceof Player player) {
                sender.sendMessage("Equipped perk 1: " + resolvePlaceholder(player, "%outlawsmp_perk1%"));
                sender.sendMessage("Equipped perk 2: " + resolvePlaceholder(player, "%outlawsmp_perk2%"));
                sender.sendMessage("Equipped skill: " + resolvePlaceholder(player, "%outlawsmp_skill%"));
                sender.sendMessage("Current bounty: " + resolvePlaceholder(player, "%outlawsmp_bounty%"));
            }
            return true;
        }
        sender.sendMessage(ChatColor.YELLOW + "Usage: /" + label
                + " <status|reload|catalog [skill|perk] [id]|preview skills|perks|inspect on|off>");
        return true;
    }
}
