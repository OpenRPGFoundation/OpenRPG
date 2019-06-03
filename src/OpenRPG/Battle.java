package OpenRPG;

public interface Battle {
    void endBattle();
    void changeActiveCharacter(IGameCharacter nextBattler);
}
