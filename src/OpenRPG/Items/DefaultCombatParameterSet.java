package OpenRPG.Items;

import OpenRPG.IParameterSet;

import java.util.Map;

public class DefaultCombatParameterSet implements IParameterSet {

    @Override
    public int getParameter(String parameterName) {
        return 0;
    }

    @Override
    public void setParameterValue(String parameter, int value) {

    }

    @Override
    public void setAllParameters(Map<String, Integer> parameters) {

    }

    @Override
    public String getAllParameters() {
        return null;
    }
}
