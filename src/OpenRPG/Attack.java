package OpenRPG;


import OpenRPG.Characters.IGameCharacter;

public interface Attack {
    int getBaseDamage();
    String getAttackName();
    void dealDamage(IGameCharacter attacker, Damageable defender);
}
