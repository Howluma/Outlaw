# OutlawExpansion — compatibility proof of concept

This is a **separate, optional Paper 1.21.11 companion plugin**. It is NOT a patched OutlawSMP JAR and cannot change every original mechanic without a supported integration point.

## Verified basis

OutlawSMP v1.3's official BuiltByBit listing documents these PlaceholderAPI placeholders:
- %outlawsmp_perk1%, %outlawsmp_perk2%, %outlawsmp_skill%
- %outlawsmp_balance%, %outlawsmp_bounty%

Paper's damage API exposes damage sources and primed TNT source attribution. The original JAR only supplies obfuscated compiled code, not a rebuildable Java project.

## What this test build does

- TNT explosion damage: 1.25x raw damage to entities other than the original igniter; 0.50x raw damage to the original igniter. The addon tracks a player/projectile/TNT priming source through block-TNT chains using temporary UUID tags where Paper exposes enough information. TNT primed only by fire, redstone or dispensers can remain unattributed; those use the normal 1.25x multiplier. The current scaling is of the raw explosion damage, so final damage after armor is not guaranteed to be an exact ratio.
- Optional Toughness: multiply raw incoming damage for players carrying Toughness by 0.975. **Off by default** because the original 95% non-player reduction must be disabled in the vendor's config first.
- Optional Sharpshooter: increase crossbow-shot projectile velocity; initial configurable multiplier 1.25. **Off by default** until the original 50% crossbow bonus is disabled.
- Optional Swift prototype: intercept a 10-second, plugin-applied Speed II effect while Swift is selected, replace it with a temporary +40% movement speed attribute modifier, and clean up on expiry, death, logout, and plugin shutdown. **Off by default** until live event-order tests succeed. Haste II is untouched.
- Optional Blacksmith recipes: source-owned 1 COBWEB -> 2 COBWEBs and stick + 8 iron nuggets -> 1 BREEZE_ROD, restricted at both crafting preview and crafting completion to players equipped with Blacksmith. **Off by default** until tested with the original recipe manager. The original four-gold apple recipe is already correct and remains in the vendor's config.
- /outlawexpansion status shows whether PlaceholderAPI is resolving a player's equipped abilities/perks.
- /outlawexpansion reload reloads the companion's own config.

## Editable catalog and shop inspection (new)

The plugin now ships an easy-edit `plugins/OutlawExpansion/catalog.yml` covering **all 13 abilities and 12 perks**:
- `display-name`: proposed shop title
- `icon`: editable Material name used by the in-game design preview
- `lore`: editable target description lines for future revised mechanics
- `planned-price`: use `-1` to leave the existing vendor price unchanged; set a number to record a proposed new price
- `implementation`: identifies whether the feature is vendor-configured, a disabled prototype, or needs integration

**These entries are a planning/preview schema, NOT active changes to the original shop or purchase behavior.** We do not pretend to adjust prices without a reliable vendor integration. They let us finalize a single editable config for a future replacement shop. The in-game **preview** GUI is protected against click/drag purchases or item extraction.

Admin commands:
- `/outlawexpansion status` — vendor/PlaceholderAPI compatibility
- `/outlawexpansion catalog` — counts, preview warning
- `/outlawexpansion catalog skill swift` — inspect proposed lore and price
- `/outlawexpansion catalog perk quickdraw` — inspect proposed lore and price
- `/outlawexpansion preview skills` / `preview perks` — open a non-purchasable, read-only GUI showing all editable names, lore, icons and proposed prices
- `/outlawexpansion inspect on` — as a player admin, arm a **one-shot** capture of the next original Skill/Perk/Outlaw shop GUI opened; print only the shop GUI's item types and visible labels/lore to server console
- `/outlawexpansion inspect off` — cancel capture
- `/outlawexpansion reload` — reload companion settings and catalog

### How to reset the vendor's configuration without losing players

The uploaded backup contains **17** player records under `data.yml`, **18** shopkeeper locations, and **1** sheriff NPC location. Only `config.yml` contains the vendor's existing ability/perk tuning. It has **no generic price or lore keys**.

On a backed-up **stopped** test server, rename `plugins/OutlawSMP/config.yml` to `config.old.yml`, restart and check whether the vendor regenerates the bundled default. Leave `data.yml`, `sheriff.yml`, and `shopkeepers.yml` alone. Your license might need to be restored using the vendor's authorized license process. The vendor's `config-version` is part of its migration logic; do not invent a new version.

See `docs/ARCHIVE_AUDIT.md` and `docs/IMPLEMENTATION_ROADMAP.md` before migrating economy data.

## Blacksmith recipe test

Set `perks.blacksmith.new-recipes-enabled: true` in `plugins/OutlawExpansion/config.yml` on a **test server** and use `/outlawexpansion reload`. Test one Blacksmith and one non-Blacksmith. The separate `OUTLAWSMP_CONFIG_PATCH.yml` offers a vendor-config-only alternative; **do not enable both vendor and addon copies of the new recipes at once** until you confirm the recipe order. The four-gold apple recipe is already present in the original config.

## New beta features (source exists and compiles, not all runtime-tested)

### Head anti-farm guard

On by default under `heads.anti-farm`, the companion records which UUIDs have killed which victims and saves timestamps into `plugins/OutlawExpansion/head-guard.yml`. Repeated kills of the same victim by a killer within **60 minutes**, or of that victim by *any* killer within **10 minutes**, suppress the resulting `PLAYER_HEAD` drops. The default filter checks the death drop list for **newly created heads owned by the victim**, keeping other players' skulls and pre-owned victim heads intact. For vendors that drop items directly into the world, `heads.anti-farm.catch-direct-spawns` provides an additional **opt-in** nearby-item filter; it is off by default because a matching pre-owned skull dropped in the same window could be mistaken for a new reward. Suicides and deaths without a player killer are not eligible to mint new rewarded heads.

This is a **drop-rate anti-farm guard, not guaranteed redemption anti-duplication**. The original Sheriff may still accept already-duplicated or old skulls. Its deposit rules, permanent redemption ledger, and original balance transaction are outside the addon. Test vendor head-spawn ordering before trusting this as production enforcement.

### Reversible Quickdraw +1

The addon can temporarily add +1 Quick Charge to a held crossbow, including level 0 -> 1 and III -> IV, and restore its original level on unequip, drop, death, inventory movement, quit, restart, and shutdown. The original level is stored in a private PersistentDataContainer tag to survive crashes.

**Disabled by default.** Both `perks.quickdraw.enabled: true` and `perks.quickdraw.vendor-fixed-level-disabled-confirmed: true` must be set. First test that changing the vendor's `quick-charge-level` to zero actually disables its fixed-enchant loop; otherwise vendor and addon may fight each other.

### Experimental Lifestealer, Degenerate, and Tank

- `skills.lifestealer.convert-regeneration: true`: intercept vendor-like 60-tick Regeneration I gained directly during a Lifestealer hit and replace it with immediate healing equal to the target's *actual health lost* (capped by final damage after mitigation and caster missing health). If the vendor applies Regen through a delayed task, this event-based prototype may miss it.
- `skills.tank.wind-charge-knockback-fix: true`: attempt to un-cancel a wind-charge knockback event for a player equipped with Tank. Does not yet cover every possible explosion-velocity path and may require further work if the vendor resets velocity later.
- `skills.degenerate.restore-instant-health-potions: true`: if the original plugin cancels a `MAGIC` healing event immediately after an actual Instant Health splash or drink, un-cancel that particular potion heal. This does not broadly disable Degenerate and does not modify other regeneration. The event order must be verified in-game.

**These are off by default and must be tested one at a time on a staging server.** The original vendor effects are not known to support a formal callback.

### Inspect exactly what the original vendor does

As an operator in-game, run `/outlawexpansion trace start`. You have 60 seconds (max 120 records) to reproduce a Tank wind-charge throw, a Degenerate Instant Health splash, or a Lifestealer hit. The companion logs the event type/cause/cancellation state and observed shop/NPC interactions to the server console; it does **not** log player names or UUIDs. `/outlawexpansion trace stop` ends the capture early. Share only the sanitized trace lines to investigate compatibility.

### Automated regression checks

Four JUnit tests now cover cooldown persistence arithmetic/clock rollback, Quick Charge +1, post-mitigation Lifestealer healing, and independent TNT self-damage scaling. GitHub Actions runs `mvn verify` against Paper 1.21.11 and uploads a compiled test artifact.

## What is not yet safe to implement as an addon

- Setting or clearing the original plugin's bounty (PlaceholderAPI gives READ-only access, not a write API).
- Making the original sheriff NPC count and pay out unique verified heads across sessions.
- Dropping a banknote redeemable through the **existing** money balance without a transaction-safe economy API.
- Activating Quickdraw safely without testing whether the original plugin can disable its fixed-level enchantment updater. The addon prototype is off by default.
- Tank, Degenerate, Lifestealer and Swift have disabled compatibility prototypes, not verified drop-in fixes. Degenerate's healing override requires a matching cancelled MAGIC heal event; it may need a different hook if the vendor suppresses the potion earlier.

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
