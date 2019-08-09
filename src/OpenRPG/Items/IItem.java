package OpenRPG.Items;

import OpenRPG.IParameterSet;

public interface IItem {
    int getValue();

    int getCost();

    IParameterSet getParameters();}
