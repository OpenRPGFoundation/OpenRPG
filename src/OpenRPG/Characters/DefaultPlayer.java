package OpenRPG.Characters;

import OpenRPG.*;

public class DefaultPlayer extends DefaultBattler implements Levelable, Moveable {

    public DefaultPlayer(String name, IParameterSet parameters) {
        super(name, parameters);
    }

    @Override
    public void animate(int frames) {

    }

    @Override
    public void animate(int... frames) {

    }

    @Override
    public void move() {

    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getExp() {
        return 0;
    }

    @Override
    public void increaseLevel() {

    }

    @Override
    public void addExperience(int exp) {

    }

    public Attack getAttack(int index){
        return null;
    }
}
