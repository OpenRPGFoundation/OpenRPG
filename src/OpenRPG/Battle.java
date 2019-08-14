package OpenRPG;

import OpenRPG.Characters.Battler;
import OpenRPG.Characters.DefaultBattler;
import OpenRPG.Characters.IGameCharacter;
import OpenRPG.Characters.IParty;

public interface Battle {
    void startBattle();
    void progressBattle();
    void endBattle();
    void changeActiveCharacter();
    void changeActiveCharacter(Battler nextBattler);
    int getBackgroundID();
    void setBackgroundID(int backgroundID);
    Battler getActiveCharacter();
}
