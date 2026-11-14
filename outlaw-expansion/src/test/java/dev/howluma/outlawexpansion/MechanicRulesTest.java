package dev.howluma.outlawexpansion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MechanicRulesTest {
    @Test void quickdrawAlwaysAddsOneLevel() {
        assertEquals(1, MechanicRules.boostedQuickCharge(0));
        assertEquals(2, MechanicRules.boostedQuickCharge(1));
        assertEquals(4, MechanicRules.boostedQuickCharge(3));
        assertEquals(10, MechanicRules.boostedQuickCharge(10));
    }

    @Test void headCooldownSurvivesReloadableEpochValues() {
        long now = 1_800_000_000_000L;
        assertFalse(MechanicRules.withinCooldown(now, null, 3_600_000));
        assertTrue(MechanicRules.withinCooldown(now, now - 3_599_999, 3_600_000));
        assertFalse(MechanicRules.withinCooldown(now, now - 3_600_000, 3_600_000));
        assertTrue(MechanicRules.withinCooldown(now, now + 1_000, 3_600_000),
                "clock rollback must not reset the farming cooldown");
        assertFalse(MechanicRules.withinCooldown(now, now - 1, 0));
    }

    @Test void lifestealUsesActualHealthLossNotRawDamage() {
        assertEquals(4, MechanicRules.lifestealHeal(20, 16, 12, 10, 20), 1e-9);
        assertEquals(0, MechanicRules.lifestealHeal(20, 20, 12, 10, 20), 1e-9,
                "absorption hearts should not generate healing");
        assertEquals(2, MechanicRules.lifestealHeal(20, 14, 6, 18, 20), 1e-9,
                "cannot heal beyond caster's missing hearts");
        assertEquals(1, MechanicRules.lifestealHeal(20, 10, 1, 10, 20), 1e-9,
                "must not heal beyond damage that passed final mitigations");
        assertEquals(0, MechanicRules.lifestealHeal(20, 19, Double.NaN, 10, 20), 1e-9);
    }

    @Test void tntMultipliersAreIndependent() {
        assertEquals(12.5, MechanicRules.tntDamage(10, 1.25, 0.5, false), 1e-9);
        assertEquals(10, MechanicRules.tntDamage(10, 1.25, 1.0, true), 1e-9);
        assertEquals(5, MechanicRules.tntDamage(10, 1.25, 0.5, true), 1e-9,
                "legacy self damage remains configurable if explicitly requested");
        assertEquals(10, MechanicRules.tntDamage(10, 1.25, -1, true), 1e-9,
                "invalid config must not turn TNT into an exploit");
    }
}
