package OpenRPG.Items;

import OpenRPG.IParameterSet;

public abstract class DefaultEquipableItem implements IItem, Equipable {

    private boolean equipped;

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public abstract IParameterSet getParameters();

    @Override
    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    @Override
    public boolean isEquipped() {
        return equipped;
    }
}
