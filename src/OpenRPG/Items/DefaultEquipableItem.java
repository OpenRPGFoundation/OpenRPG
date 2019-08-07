package OpenRPG.Items;

import OpenRPG.IParameters;

public class DefaultEquipableItem implements IItem, Equipable {

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
    public IParameters getParameters() {
        return null;
    }

    @Override
    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    @Override
    public boolean isEquipped() {
        return equipped;
    }
}
