package OpenRPG;

public interface Attack {
    int getBaseDamage();
    String getAttackName();
    void dealDamage(IGameCharacter attacker, Damageable defender);
}
