package OpenRPG;

public interface AttackProcessor {
    int calculateDamage(IParameters attackerStats, IParameters defenderStats, DamageModifier modifier);

}
