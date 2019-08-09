package OpenRPG;


import OpenRPG.Characters.DefaultBattler;

public interface Attack {
    int getBaseDamage();
    String getAttackName();
    int calculateDamage(IParameters attackerStats, IParameters defenderStats, Modifier modifier);
    void dealDamage(DefaultBattler attacker, Damageable defender);
}
