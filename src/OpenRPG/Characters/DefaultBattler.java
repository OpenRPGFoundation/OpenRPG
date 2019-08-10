package OpenRPG.Characters;

import OpenRPG.Animation;
import OpenRPG.Damageable;
import OpenRPG.IParameterSet;

import java.util.Comparator;

public class DefaultBattler extends DefaultCharacter implements Damageable, Healable, Animation {

    public DefaultBattler(String name, IParameterSet parameters) {
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

    public static Comparator<DefaultBattler> compareSpeed = new Comparator<DefaultBattler>() {
        @Override
        public int compare(DefaultBattler b1, DefaultBattler b2) {
            int battler1Speed = b1.g
            return 0;
        }
    };
}
