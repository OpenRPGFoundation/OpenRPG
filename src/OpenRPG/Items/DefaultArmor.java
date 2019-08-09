package OpenRPG.Items;

import OpenRPG.IParameterSet;

public class DefaultArmor extends DefaultEquipableItem {

    private DefaultCombatParameterSet parameters;

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

    public DefaultCombatParameterSet getCombatParameters() {
        return parameters;
    }
}
