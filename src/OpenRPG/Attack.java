package OpenRPG;


import OpenRPG.Characters.DefaultBattler;

public interface Attack {
    int getBaseDamage();
    String getAttackName();
    void dealDamage(DefaultBattler attacker, Damageable defender);
}
