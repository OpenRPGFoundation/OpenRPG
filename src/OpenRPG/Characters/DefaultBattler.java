package OpenRPG.Characters;

import OpenRPG.*;

import java.util.Comparator;

public class DefaultBattler extends DefaultCharacter implements Damageable, Healable, Battler, Animation {

    protected IParameterSet parameters;
    protected static String COMPARE_PARAMETER;

    public DefaultBattler(String name) {
        super(name);
        this.parameters = null;
        COMPARE_PARAMETER = "Speed";
    }

    public DefaultBattler(String name, IParameterSet parameters) {
        super(name);
        this.parameters = parameters;
        COMPARE_PARAMETER = "Speed";
    }

    public DefaultBattler(String name, IParameterSet parameters, String compareParameterName) {
        super(name);
        this.parameters = parameters;
        COMPARE_PARAMETER = compareParameterName;
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
        return getParameter(COMPARE_PARAMETER);
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

    public Attack getAttack(int index){
        return null;
    }
}
