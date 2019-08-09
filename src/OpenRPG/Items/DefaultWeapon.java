package OpenRPG.Items;

import OpenRPG.IParameterSet;

public class DefaultWeapon extends DefaultEquipableItem {

    private DefaultCombatParameterSet parameters;

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

    public DefaultCombatParameterSet getCombatParameters() {
        return parameters;
    }
}
