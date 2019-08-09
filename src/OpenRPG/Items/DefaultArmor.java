package OpenRPG.Items;

import OpenRPG.IParameters;

public class DefaultArmor extends DefaultEquipableItem {

    private DefaultCombatParameters parameters;

    @Override
    public IParameters getParameters() {
        return parameters;
    }

    public DefaultCombatParameters getCombatParameters() {
        return parameters;
    }
}
