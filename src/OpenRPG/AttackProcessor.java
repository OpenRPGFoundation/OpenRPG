package OpenRPG;

public interface AttackProcessor {
    int calculateDamage(IStats attackerStats, IStats defenderStats, DamageModifier modifier);

}
