package OpenRPG;

import OpenRPG.Characters.Battler;

public interface TurnBased {

    void setBattleOrder();
    void changeNextActiveCharacter(Battler nextBattler);
    void moveBattlerToIndex(Battler battler, int index);
    void addBattler(Battler battler, int index);
}
