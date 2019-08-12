package OpenRPG.Items;

import OpenRPG.IParameterSet;

public class DefaultWeapon extends DefaultEquipableItem {

    private IParameterSet parameters;

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

}
