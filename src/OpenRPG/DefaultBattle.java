package OpenRPG;

import OpenRPG.Characters.*;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * @
 */
public class DefaultBattle implements Battle, IScene {

    private IParty playerParty, enemyParty;

    private LinkedList<Battler> battleOrder = new LinkedList<>();
    private Battler activeCharacter;

    public DefaultBattle(IParty playerParty, IParty enemyParty) {
        this.playerParty = playerParty;
        this.enemyParty = enemyParty;

        setBattleOrder();
    }


    @Override
    public void startBattle() {

    }

    @Override
    public void endBattle() {

    }

    @Override
    public void setBattleOrder() {
        ArrayList<Battler> sorter = new ArrayList<>();

        for(Battler battler : playerParty.getAllCharacters()) {
            sorter.add((DefaultBattler) battler);
        }

        for(Battler battler : enemyParty.getAllCharacters()) {
            sorter.add((DefaultBattler) battler);
        }

        sorter.sort(Battler.compareBattleOrder);

        for(Battler battler : sorter) {
            battleOrder.add(battler);
        }
    }

    @Override
    public void changeActiveCharacter() {
        battleOrder.push(battleOrder.pop());
    }

    @Override
    public void changeActiveCharacter(Battler nextBattler) {
        if(battleOrder.contains(nextBattler)) {
            battleOrder.remove(nextBattler);
        }

        battleOrder.addFirst(nextBattler);
    }

    @Override
    public Battler getActiveCharacter() {
        return battleOrder.getFirst();
    }

    @Override
    public void progressBattle() {
        changeActiveCharacter();
    }

    @Override
    public void displayBackground() {

    }

    public LinkedList<Battler> getBattleOrder() {
        return battleOrder;
    }
}
