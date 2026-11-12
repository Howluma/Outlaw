# OutlawSMP v1.3 archive audit (2026-11-12)

This summary intentionally **contains no license key, player UUIDs, player names, balances, or location coordinates**. The uploaded archive was inspected locally and has not been committed.

| Archive path | Role | Observed |
| --- | --- | --- |
| `OutlawSMP/config.yml` | Vendor settings, license, skins, active perk/skill tuning | `config-version: 2`; 13 skills; 12 perks; NO general store item price/description fields |
| `OutlawSMP/data.yml` | Player identity keyed by UUID, `balance`, `bounty`, `last-known-name`, equipped slots | 17 player records; eight nonzero bounties in this archived snapshot; mixed numeric and string balance types |
| `OutlawSMP/sheriff.yml` | Sheriff entity placement | 1 sheriff; coordinates and entity UUIDs only; **no persisted head-deposit counters** |
| `OutlawSMP/shopkeepers.yml` | Shopkeeper NPC placements | 18 shopkeepers; coordinates and entity UUIDs, not shop items/prices |

## Verified configuration observations

- `perks.toughness.damage-reduction` is `0.95` and documents **non-player** damage only. Setting this to `0.025` is NOT equivalent to the requested 2.5% all-damage mitigation.
- `perks.quickdraw.quick-charge-level` is a fixed level, `2`, not an additive enchantment level.
- `perks.sharpshooter.damage-bonus` is `0.50`, not projectile-velocity scaling.
- `perks.blacksmith.recipes` contains cobweb and cheap-gap recipes; cheap-gap already uses 4 gold in the cardinal directions.
- `dupe-fix: true` only describes anti-farming of **+10 kill bounties** for repeated kills of the same player, NOT unique player-head redemption at the sheriff.
- `head-drop: true` enables head drops; this is not proof of a unique anti-farm marker.
- `data.yml` stores bounties/coins, but that does **not** imply a hot-reload or write-safe API. The vendor can maintain in-memory state and overwrite edits on shutdown.

## Reset safety

If you want the vendor's default config again, do not erase your player data or NPC files. Back up and rename only `plugins/OutlawSMP/config.yml` while the server is stopped; restart and verify that the vendor recreates it. Do not share the original license/skin-signature fields publicly. The new `OutlawExpansion/catalog.yml` is a separate, safe-to-share planning catalog.

## Data migration prerequisites for a full replacement

1. Migrate by UUID, not username; preserve `balance`, `bounty`, `equipped.skill`, `equipped.perk1`, and `equipped.perk2`.
2. Handle both YAML numeric balance values and numbers encoded as strings / scientific notation. Reject NaN/infinite/negative values if not legitimate.
3. Preserve saved NPC positions independently from player data, with UUID collision checks.
4. Do a one-time migration on a stopped copy; never concurrently edit the vendor's live `data.yml`.
5. Write a migration marker and verify record counts plus aggregate totals before allowing players to join.
6. Run a test season before removing the vendor JAR.

## Missing evidence

- The vendor's internal shop item IDs, exact current prices, and displayed descriptions.
- How the vendor caches purchases, active cooldowns, and bounty state.
- Whether the original perk effects can be reliably disabled without replacing the related GUI.
- In-game performance on the target Paper build with the owner's plugin stack.

Use `/outlawexpansion inspect on` on a **private test server**, then open each vendor shop and provide the sanitized console snapshot and `logs/latest.log` with any tokens/IPs removed. No player personal inventory or account data is dumped by that command.
