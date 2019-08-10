package OpenRPG;

import OpenRPG.Characters.DefaultBattler;
import OpenRPG.Characters.DefaultParty;
import OpenRPG.Characters.IGameCharacter;
import OpenRPG.Characters.IParty;

public class DefaultBattle implements Battle, IScene {

    private DefaultParty playerParty, enemyParty, battleOrder;

    public DefaultBattle(DefaultParty playerParty, DefaultParty enemyParty) {
        this.playerParty = playerParty;
        this.enemyParty = enemyParty;
    }


    @Override
    public void startBattle() {

    }

    @Override
    public void endBattle() {

    }

    @Override
    public void setBattleOrder(IParty battleOrder, IParty playerParty, IParty enemyParty) {

    }

    @Override
    public void changeActiveCharacter(DefaultBattler nextBattler) {

    }

    @Override
    public void displayBackground() {

    }
}
