# Outlaw SMP customization and replacement roadmap

**Target:** Paper 1.21.11, Java 21. **Source constraint:** the v1.3 vendor JAR is commercial, obfuscated and has no supported source in the owner's repository. The storefront lists it as not open source/unobfuscated. Do not patch licensing code, republish decompiled vendor code, or pretend read-only placeholders can mutate vendor state.

## Architecture choice

**Short term:** OutlawExpansion runs beside the purchased OutlawSMP, providing independently safe event changes, a draft catalog, config recipe patches, and an in-game test/inspection command.

**Long term:** Build a clean-room, fully source-controlled **Outlaw Core v2** with its own economy, custom NPC shops, 13 abilities, 12 perks, cooldowns, bounties, head redemption and banknotes. Import existing vendor data once on a **stopped** server after backups. Remove the vendor JAR only once parity tests pass. This is the only approach that can guarantee full ownership of prices, descriptions, and complex ability internals without a vendor API.

This is a proposed roadmap, not a claim that the v2 replacement currently exists.

## Feature feasibility and integration boundary

| Requested feature | Safe companion plugin without vendor source? | Reliable full-replacement approach |
| --- | --- | --- |
| Admin `/setbounty` command | Not for live vendor bounty without write API; offline YAML edits may be overwritten | Command edits owned UUID-keyed bounty ledger |
| Head deposits survive logouts | Need to replace or intercept original Sheriff head processing | Transactional persistent per-player head counter |
| Prevent farming player heads for money | Must control both head creation and redemption; vendor may still award money | Signed/marked heads per kill, victim UUID + anti-farm rules + consumed redemption record |
| Bounty cleared and redeemable on death | Vendor bounty/economy state not safely mutable | Atomically clear bounty on death; issue one authenticated banknote excluding its subject |
| Toughness all damage -2.5% | Optional addon prototype; disable original 95% non-player reduction | Multiplicative 0.975 reduction at documented damage stage |
| Tank affected by thrown wind charges | Event interference possible; original ability might cancel knockback every tick | Remove wind-charge knockback exemption while Tank active |
| Instant health heals under Degenerate | Might require cancelling original healing suppression; needs event order test | Distinguish INSTANT_HEALTH from passive/other healing |
| Three Blacksmith recipes | Existing vendor config supports recipes; arbitrary new recipe key must be tested | Own shaped/shapeless recipes registered on enable, restricted to Blacksmith |
| Quickdraw +1 enchant when held | Risk of racing vendor equipment enforcement and item dupes | Dynamic hand-only enchant/charge logic with safe original restoration |
| Sharpshooter only boosts crossbow projectile velocity | Optional addon prototype; zero original damage bonus first | Crossbow-only velocity modifier with tuned multiplier |
| Swift Speed II equivalent as attribute | Disabled, event-based addon prototype | Temporary nonpersistent +40% movement-speed modifier, Haste handled separately |
| Lifestealer heals equal to damage actually taken by victim | Vendor may still apply regeneration; needs test | Heal from post-mitigation health lost, bounded by target HP and caster max health |
| TNT +25% damage, original igniter takes half | Addon prototype handles directly-attributed TNT; chain cases need tests | Unified igniter-attribution registry and damage scaling |
| Admin-editable perk/skill prices | **No existing vendor price config or public write API** | Prices enforced by our own shops, validated and debited atomically |
| Editable accurate item names and descriptions | Draft catalog exists; vendor GUI not yet overridden | Render lore from config + computed parameters on every menu open |
| Redesign weaker abilities/perks | Can't reliably disable hidden vendor effects individually | Replace selected modules with source-owned implementations |

## Catalog semantics

`src/main/resources/catalog.yml` is intentionally *design-only* at present. `display-name`, `lore`, `planned-price` and `implementation` are editable with `/outlawexpansion reload`. **Changing a planned price does not charge that amount; it only records the intended price.** Do not use draft lore in the live vendor shop until mechanics match.

Keep unchanged prices as `planned-price: -1`; enter actual requested new prices after confirming old GUI price labels. Avoid guessing values for an economy containing legacy balances with mixed YAML types.

## Candidate redesigns for discussion (NOT implemented)

| Existing ability/perk | Optional redesign | Balance guardrail |
| --- | --- | --- |
| Mirage | **Phantom Trail:** short blink, then a brief visible afterimage at departure | Preserve 8-block cap, cannot phase through protected blocks |
| Hypnosis | **False Signal:** disorient target with misleading sound cues and a short, clearly bounded combat debuff | No camera seizure/flicker; limited cooldown and duration |
| Venom | **Toxic Pressure:** poison is mild but refreshes on a successful follow-up hit during a short window | No perma-poison loops |
| Wager | **High Stakes:** clearly signaled random damage/haste boon with a small drawback if the gamble fails | Never random instant kills |
| Efficiency perk | **Prospector:** retain Haste I and grant a short conditional boost after breaking ore | Avoid runaway economy multipliers |
| Regenerate perk | **Recovery:** weaker persistent healing, stronger after a safe period out of combat | Avoid stacking unlimited healing with Lifestealer |
| Shield perk | **Parry:** add a brief defensive reward for well-timed shield use | Cooldown, no permanent immunity |

Descriptions in the catalog currently document existing config values or the user's specific requested mechanics, not these unapproved redesigns.

## Next data needed to implement the remaining systems

1. **Test server access**: Paper version, console and latest.log, ability to upload/restart plugins. Keep credentials in the host's secure access mechanism; do not paste tokens.
2. **Original shop snapshots**: command `/outlawexpansion inspect on`, then open Skills/Perks store menus. Need exact displayed prices and lore to compare with the proposed catalog.
3. **Original resource pack**: icons, custom-model IDs and naming must be preserved in replacement GUI. Only share if redistribution is permitted.
4. **Behavior recordings**: activate each of 13 skills; test recharge, kill effects, damage interactions, knockback and potion exceptions.
5. **Offline backup**: migration source `data.yml`, `sheriff.yml`, `shopkeepers.yml` (already archived). Do not upload files containing license credentials into public GitHub.
6. **A price spreadsheet or brief price list**: only for entries whose cost should change. A fully editable price system can then enforce those amounts.

## Server-side acceptance tests

- Prices and descriptions update after config reload and match the actual purchase debits; insufficient funds cannot purchase.
- Currency remains finite and consistent, including scientific-notation legacy values, huge balances, simultaneous purchases, crashes and relogs.
- Every paid perk/ability has a consistent upgrade/withdrawal flow.
- Sheriff counts survive restart; heads cannot be cloned/redeemed twice; alt farming limits are explicit.
- On bounty target death, exactly one eligible banknote is issued with subject UUID and amount; target cannot redeem it, even when held by a friend.
- Every combat event has exactly one perk/skill application (no duplicate handlers).
- TNT self-igniter cases and chain ignition rules are tested with protection enchantments and other combat plugins.
- Backups can be restored without losing NPC positions or players' equipment.

**Production rule:** do not swap the main vendor JAR until full-replacement parity and migration tests have passed.
