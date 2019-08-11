package OpenRPG;

import OpenRPG.Characters.DefaultBattler;
import OpenRPG.Characters.IParty;

public interface Battle {
    void startBattle();
    void endBattle();
    void setBattleOrder(IParty playerParty, IParty enemyParty);
    void changeActiveCharacter(DefaultBattler nextBattler);
    void progressBattle();
}
