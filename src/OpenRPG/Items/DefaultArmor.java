package OpenRPG.Items;

import OpenRPG.IParameterSet;

public class DefaultArmor extends DefaultEquipableItem {

    private IParameterSet parameters;

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

    public DefaultCombatParameterSet getCombatParameters() {
        return (DefaultCombatParameterSet)parameters;
    }
}
