package dev.howluma.outlawexpansion;

/**
 * Pure deterministic rules used by the event handlers.
 * Kept independent from Bukkit so they can be unit tested in CI.
 */
public final class MechanicRules {
    private MechanicRules() {}

    public static boolean withinCooldown(long now, Long previous, long durationMs) {
        if (previous == null || durationMs <= 0) return false;
        if (previous > now) return true; // fail closed if system clock moves backwards
        return now - previous < durationMs;
    }

    public static int boostedQuickCharge(int original) {
        return Math.min(10, Math.max(0, original) + 1);
    }

    /**
     * Healing is bounded by post-mitigation damage, the health truly lost
     * by the target, and the caster's missing health.
     */
    public static double lifestealHeal(double beforeHealth, double afterHealth,
                                       double finalDamage, double casterHealth,
                                       double casterMaxHealth) {
        if (!Double.isFinite(beforeHealth) || !Double.isFinite(afterHealth)
                || !Double.isFinite(finalDamage) || !Double.isFinite(casterHealth)
                || !Double.isFinite(casterMaxHealth)) return 0;
        return Math.max(0, Math.min(Math.min(finalDamage,
                Math.max(0, beforeHealth - afterHealth)),
                Math.max(0, casterMaxHealth - casterHealth)));
    }

    public static double tntDamage(double originalRawDamage,
                                   double againstOthers, double againstIgniter,
                                   boolean hitIgniter) {
        if (!Double.isFinite(originalRawDamage) || originalRawDamage < 0) return 0;
        double multiplier = hitIgniter ? againstIgniter : againstOthers;
        if (!Double.isFinite(multiplier) || multiplier < 0 || multiplier > 10) {
            return originalRawDamage;
        }
        return originalRawDamage * multiplier;
    }
}
