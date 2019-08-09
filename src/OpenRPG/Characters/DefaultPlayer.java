package OpenRPG.Characters;

import OpenRPG.IParameterSet;
import OpenRPG.Levelable;
import OpenRPG.Moveable;

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

    @Override
    public void damage(int amount) {
        int oldHP = parameters.getParameter("currentHP");
        int newHP = oldHP - amount;

        if(newHP < 0) {
            newHP = 0;
        }

        parameters.setParameterValue("currentHP", newHP);
    }

    @Override
    public void heal(int amount) {
        int oldHP = parameters.getParameter("currentHP");
        int newHP = oldHP + amount;
        parameters.setParameterValue("currentHP", newHP);
    }
}
