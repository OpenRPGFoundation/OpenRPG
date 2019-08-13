package OpenRPG.Characters;

import OpenRPG.*;
import OpenRPG.Items.DefaultCombatParameterSet;

import java.util.Comparator;

public class DefaultBattler extends DefaultCharacter implements Damageable, Healable, Battler, Animation {

    protected IParameterSet parameters;

    public DefaultBattler(String name) {
        super(name);
        this.parameters = null;
    }

    public DefaultBattler(String name, IParameterSet parameters) {
        super(name);
        this.parameters = parameters;
    }

    @Override
    public void animate(int frames) {

    }

    @Override
    public void animate(int... frames) {

    }

    @Override
    public void damage(int amount) {
        IParameter oldHP = parameters.getParameter("currentHP");
        int difference = oldHP.getValue() - amount;

        if(difference < 0) {
            difference = 0;
        }

        DefaultParameter newHP = new DefaultParameter(difference);

        parameters.setParameter("currentHP", newHP);
    }

    @Override
    public void heal(int amount) {
        IParameter oldHP = parameters.getParameter("currentHP");
        IParameter totalHP = parameters.getParameter("HP");

        int total = oldHP.getValue() + amount;

        if (total > totalHP.getValue()) {
            total = totalHP.getValue();
        }

        DefaultParameter newHP = new DefaultParameter(total);

        parameters.setParameter("currentHP", newHP);
    }

    @Override
    public IParameter getBattleOrderParameter() {
        return getSpeed();
    }

    public IParameter getParameter(String parameterName) {
        return parameters.getParameter(parameterName);
    }

    @Override
    public void setParameter(String parameterName, IParameter parameter) {
        parameters.setParameter(parameterName, parameter);
    }

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(IParameterSet parameters) {
        this.parameters = parameters;
    }

    public IParameter getSpeed() {
        return parameters.getParameter("Speed");
    }

    public static Comparator<DefaultBattler> compareSpeed = new Comparator<DefaultBattler>() {
        @Override
        public int compare(DefaultBattler b1, DefaultBattler b2) {
            IParameter battler1Speed = b1.getSpeed();
            IParameter battler2Speed = b2.getSpeed();

            return DefaultParameter.compareParameter.compare((DefaultParameter)battler1Speed, (DefaultParameter)battler2Speed);
        }
    };

    public Attack getAttack(int index){
        return null;
    }
}
