package OpenRPG;


import OpenRPG.Characters.Battler;

public interface Attack {
    int getBaseDamage();
    String getAttackName();
    int calculateDamage(IParameterSet attackerStats, IParameterSet defenderStats, Modifier modifier);
    void dealDamage(Battler attacker, Damageable defender);
}
