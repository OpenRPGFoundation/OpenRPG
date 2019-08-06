package OpenRPG.Items;

import OpenRPG.IParameters;

public interface IItem {
    int getValue();

    int getCost();

    IParameters getParameters();

}
