package OpenRPG.Items;

import OpenRPG.IParameters;

import java.util.Map;

public class DefaultCombatParameters implements IParameters {

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
