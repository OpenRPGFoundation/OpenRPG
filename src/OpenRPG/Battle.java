package OpenRPG;

import OpenRPG.Characters.Battler;
import OpenRPG.Characters.DefaultBattler;
import OpenRPG.Characters.IGameCharacter;
import OpenRPG.Characters.IParty;

public interface Battle {
    void startBattle();
    void progressBattle();
    void endBattle();
    void setBattleOrder();
    void changeActiveCharacter();
    void changeActiveCharacter(Battler nextBattler);
    Battler getActiveCharacter();
}
