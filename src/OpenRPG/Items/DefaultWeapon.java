package OpenRPG.Items;

import OpenRPG.IParameters;

public class DefaultWeapon extends DefaultEquipableItem {

    private DefaultCombatParameters parameters;

    @Override
    public IParameters getParameters() {
        return parameters;
    }

    public DefaultCombatParameters getCombatParameters() {
        return parameters;
    }
}