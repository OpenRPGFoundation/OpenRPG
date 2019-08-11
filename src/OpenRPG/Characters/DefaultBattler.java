package OpenRPG.Characters;

import OpenRPG.Animation;
import OpenRPG.Damageable;
import OpenRPG.DefaultParameter;
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
        DefaultParameter oldHP = parameters.getParameter("currentHP");
        int difference = oldHP.getValue() - amount;

        if(difference < 0) {
            difference = 0;
        }

        DefaultParameter newHP = new DefaultParameter(difference);

        parameters.setParameter("currentHP", newHP);
    }

    @Override
    public void heal(int amount) {
        DefaultParameter oldHP = parameters.getParameter("currentHP");
        DefaultParameter totalHP = parameters.getParameter("HP");

        int total = oldHP.getValue() + amount;

        if (total > totalHP.getValue()) {
            total = totalHP.getValue();
        }

        DefaultParameter newHP = new DefaultParameter(total);

        parameters.setParameter("currentHP", newHP);
    }

    public DefaultParameter getParameter(String parameterName) {
        return parameters.getParameter(parameterName);
    }

    public DefaultParameter getSpeed() {
        return parameters.getParameter("speed");
    }

    public static Comparator<DefaultBattler> compareSpeed = new Comparator<DefaultBattler>() {
        @Override
        public int compare(DefaultBattler b1, DefaultBattler b2) {
            DefaultParameter battler1Speed = b1.getSpeed();
            DefaultParameter battler2Speed = b2.getSpeed();

            return DefaultParameter.compareParameter.compare(battler1Speed, battler2Speed);
        }
    };
}
