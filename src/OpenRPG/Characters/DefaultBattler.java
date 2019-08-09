package OpenRPG.Characters;

import OpenRPG.Animation;
import OpenRPG.Damageable;
import OpenRPG.IParameters;

public class DefaultBattler extends DefaultCharacter implements Damageable, Healable, Animation {

    public DefaultBattler(String name, IParameters parameters) {
        super(name, parameters);
    }

    @Override
    public void animate(int frames) {

    }

    @Override
    public void animate(int... frames) {

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
