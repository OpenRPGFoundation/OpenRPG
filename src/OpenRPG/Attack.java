package OpenRPG;

public interface Attack {
    int getBaseDamage();

    void dealDamage(IGameCharacter attacker, IGameCharacter defender);
}
