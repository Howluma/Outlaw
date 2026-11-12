# OutlawExpansion — compatibility proof of concept

This is a **separate, optional Paper 1.21.11 companion plugin**. It is NOT a patched OutlawSMP JAR and cannot change every original mechanic without a supported integration point.

## Verified basis

OutlawSMP v1.3's official BuiltByBit listing documents these PlaceholderAPI placeholders:
- %outlawsmp_perk1%, %outlawsmp_perk2%, %outlawsmp_skill%
- %outlawsmp_balance%, %outlawsmp_bounty%

Paper's damage API exposes damage sources and primed TNT source attribution. The original JAR only supplies obfuscated compiled code, not a rebuildable Java project.

## What this test build does

- TNT explosion damage: 1.25x raw damage to entities other than the original igniter; 0.50x raw damage to the player who directly ignited TNT, where TNTPrimed.getSource() identifies that player.
- Optional Toughness: multiply raw incoming damage for players carrying Toughness by 0.975. **Off by default** because the original 95% non-player reduction must be disabled in the vendor's config first.
- Optional Sharpshooter: increase crossbow-shot projectile velocity; initial configurable multiplier 1.25. **Off by default** until the original 50% crossbow bonus is disabled.
- Optional Swift prototype: intercept a 10-second, plugin-applied Speed II effect while Swift is selected, replace it with a temporary +40% movement speed attribute modifier, and clean up on expiry, death, logout, and plugin shutdown. **Off by default** until live event-order tests succeed. Haste II is untouched.
- /outlawexpansion status shows whether PlaceholderAPI is resolving a player's equipped abilities/perks.
- /outlawexpansion reload reloads the companion's own config.

## What is not yet safe to implement as an addon

- Setting or clearing the original plugin's bounty (PlaceholderAPI gives READ-only access, not a write API).
- Making the original sheriff NPC count and pay out unique verified heads across sessions.
- Dropping a banknote redeemable through the **existing** money balance without a transaction-safe economy API.
- Replacing Quickdraw's temporary enchantment behavior: its existing update loop could overwrite or fight our replacement, and inventories need anti-duplication tests.
- Tank, Degenerate, Lifestealer: requires a temporary server to identify event ordering and whether the original plugin blocks/reapplies effects. Swift has a disabled opt-in prototype.

These are still part of the requested work. Do not confuse an addon-created *second* bounty economy with the existing one.

## Build

Run: mvn -B -f outlaw-expansion/pom.xml package

GitHub Actions packages the JAR as a downloadable build artifact for test servers.

## Test server installation

1. Back up your server, its world, and plugins/OutlawSMP directory.
2. Install the original OutlawSMP, PlaceholderAPI, and this test plugin into plugins/.
3. Start a Paper 1.21.11 test server, use /outlawexpansion status as OP.
4. Test TNT with mobs, another player, and the player who ignited it. Chain-primed TNT may not expose an igniter, so do not assume the half-damage rule applies in that case.
5. Read OUTLAWSMP_CONFIG_PATCH.yml. Copy only the relevant values into the original OutlawSMP config, preserving all unrelated keys. Restart to test Blacksmith recipes.
6. Only after neutralizing the old Toughness/Sharpshooter effect, enable those features in plugins/OutlawExpansion/config.yml and reload.
7. Test with and without armor and other protection enchantments: raw-damage scaling can differ from the effective post-armor ratio.

## Important compatibility boundaries

- PAPI is read-only. It does not expose a setter for bounty, skill activation state, or saved sheriff statistics.
- Changes from other plugins can change event order or damage multipliers; use a clean test server.
- Original OutlawSMP is commercial and uses licensing/obfuscation. Do not publish the vendor JAR or a license key in a public repository.
- Do not use this draft as a production replacement until in-server tests pass.
