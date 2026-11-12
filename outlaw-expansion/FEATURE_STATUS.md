# OutlawExpansion feature status (test branch)

**Main vendor JAR is unchanged.** Status describes the secondary plugin, not features already added to the original plugin. `enabled by default` is not the same as runtime verified.

| Original request | Current addon status | Limitation / setup |
| --- | --- | --- |
| Admin set player bounties | Blocked | Vendor data.yml is not safe to mutate while its own plugin is loaded; no documented write API |
| Sheriff deposit total persists across relogs | Blocked | No persisted deposit count found in archive; inspect Sheriff NPC interaction and payment events |
| Prevent farming player heads | **Implemented — default on, partial** | Persistent UUID-based cooldowns suppress newly minted victim heads. Original sheriff still needs a one-use redemption ledger |
| Bounties clear on death, banknote drop for others only | Blocked | Requires authoritative bounty and economy mutation; do not create dupable payouts based on read-only placeholders |
| Toughness reduces all damage by 2.5% | Implemented **opt-in** | Original non-player 95% reduction must be disabled and final-damage balance must be tested |
| Tank accepts wind-charge knockback | Experimental **opt-in** | Intercepts cancelable knockback-by-wind-charge events; vendor may suppress another velocity path |
| Degenerate permits Instant Health potions | Experimental **opt-in** | Re-enables matching canceled MAGIC healing from genuine health splash/drink; live trace needed |
| Blacksmith: 4-gold apple | Original vendor config already supports it | Correct existing 4-cardinal-gold recipe; do not duplicate |
| Blacksmith: 1 cobweb => 2 cobwebs | Implemented **opt-in** | Custom recipe perk-locked; also available via vendor recipe config patch |
| Blacksmith: iron nuggets + stick => breeze rod | Implemented **opt-in** | Requires PAPI bridge and must avoid vendor recipe collision |
| Quickdraw adds +1 Quick Charge while held | Implemented **opt-in prototype** | Restores original enchant/PDC on transfer and logout; vendor updater must be neutralized |
| Sharpshooter increases crossbow velocity | Implemented **opt-in** | 1.25x test value configurable; original bonus damage must be neutralized |
| Swift uses Speed II-equivalent attribute | Implemented **opt-in prototype** | Detects vendor 10-second Speed II plugin effect; Haste untouched |
| Lifestealer converts post-mitigation damage into self-heal | Implemented **opt-in prototype** | Uses vendor 60-tick regen event as active-ability signal; event ordering needs test |
| TNT 1.25x damage, igniter 0.5x | **Implemented — default on** | Scaling currently applies to raw event damage; tracks chain igniter if Paper provides a primer |
| Configurable perk/ability prices | **Preview only** | `catalog.yml` stores planned prices but does not change vendor shop purchase debits |
| Accurate perk/ability descriptions | **Preview only** | Editable `catalog.yml`, 25 entries, `/outlawexpansion preview skills|perks`; vendor GUI not yet replaced |
| Redesign lackluster abilities and perks | Proposed only | See `docs/IMPLEMENTATION_ROADMAP.md`, approve designs before reimplementing |

## Commands

- `/outlawexpansion status`: show original plugin/PAPI connectivity and toggles
- `/outlawexpansion preview skills` or `preview perks`: view catalog mockups
- `/outlawexpansion catalog skill swift` or `catalog perk quickdraw`: inspect planned values
- `/outlawexpansion reload`: reload companion config + draft catalog
- `/outlawexpansion inspect on`: arm one-shot original GUI price/lore console snapshot
- `/outlawexpansion inspect off`: cancel snapshot
- `/outlawexpansion trace start`: as OP, trace relevant effects, NPC interaction and damage for 60 seconds
- `/outlawexpansion trace stop`: end tracing early

## Before using on a live server

1. Back up world and `plugins/OutlawSMP` directory.
2. Install on a **separate Paper 1.21.11 test server** alongside OutlawSMP.
3. Install PlaceholderAPI for perk/ability detection.
4. First use `/outlawexpansion status` and `trace start`; test a clean direct TNT blast and repeated PvP kills.
5. Enable experimental flags **one at a time**. Changes to the original `config.yml` should only be made when you understand how the vendor reloads them.
6. Never enable conflicting vendor and addon recipes or perk enchantment loops.
7. Report sanitized console trace and any relevant errors; do not send vendor license keys or personal player data publicly.

## Verification

GitHub Actions compiles the Java 21 / Paper 1.21.11 project and runs four JUnit tests. A successful CI build only proves source compatibility and rule arithmetic; it does not prove live integration with the original commercial plugin.
