package OpenRPG.Items;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public class DefaultCombatParameterSet implements IParameterSet {

    HashMap<String, DefaultParameter> parameters;

    @Override
    public DefaultParameter getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameter(String parameterName, DefaultParameter parameter) {

    }

    @Override
    public void setAllParameters(Map<String, DefaultParameter> parameters) {

    }

    @Override
    public String getAllParameters() {
        return null;
    }
}
