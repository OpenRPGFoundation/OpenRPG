package OpenRPG;

import OpenRPG.Characters.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 * @
 */
public class DefaultBattle implements Battle, TurnBased, IScene {

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
        battleOrder.add(battleOrder.poll());
    }

    @Override
    public void changeActiveCharacter(Battler nextBattler) {
        if(battleOrder.contains(nextBattler)) {
            battleOrder.remove(nextBattler);
        }

        battleOrder.addFirst(nextBattler);
    }

    @Override
    public int getBackgroundID() {
        return 0;
    }

    @Override
    public void setBackgroundID(int backgroundID) {

    }

    @Override
    public void changeNextActiveCharacter(Battler nextBattler) {
        battleOrder.remove(nextBattler);
        battleOrder.add(1, nextBattler);
    }

    @Override
    public void moveBattlerToIndex(Battler battler, int index) {
        battleOrder.remove(battler);
        addBattler(battler, index);
    }

    @Override
    public void addBattler(Battler battler, int index) {
        battleOrder.add(index, battler);
    }

    @Override
    public Battler getActiveCharacter() {
        return battleOrder.getFirst();
    }

    @Override
    public void progressBattle() {
        changeActiveCharacter();
    }

    public LinkedList<Battler> getBattleOrder() {
        return battleOrder;
    }

    @Override
    public Point getCharacterLocation(IGameCharacter character) {
        return null;
    }

    @Override
    public Point[] getAllCharacterLocations() {
        return new Point[0];
    }

    @Override
    public void setCharacterLocation(IGameCharacter character, Point location) {

    }
}
