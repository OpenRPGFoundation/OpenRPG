package OpenRPG;

import OpenRPG.Characters.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class DefaultBattle implements Battle, IScene {

    private DefaultParty playerParty, enemyParty;

    private LinkedList<DefaultBattler> battleOrder = new LinkedList<>();

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
    public void setBattleOrder(IParty playerParty, IParty enemyParty) {
        ArrayList<DefaultBattler> sorter = new ArrayList<>();
        sorter.sort(DefaultBattler.compareSpeed);

        for (DefaultBattler battler : sorter) {
            battleOrder.add(battler);
        }
    }

    @Override
    public void changeActiveCharacter(DefaultBattler nextBattler) {

    }

    @Override
    public void progressBattle() {
        DefaultBattler activeCharacter = battleOrder.pop();

        if(activeCharacter instanceof DefaultPlayer) {
            DefaultPlayer activePlayerCharacter = (DefaultPlayer) activeCharacter;
        } else {

        }
    }

    @Override
    public void displayBackground() {

    }
}
