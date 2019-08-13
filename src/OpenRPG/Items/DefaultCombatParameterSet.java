package OpenRPG.Items;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameter;
import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public class DefaultCombatParameterSet implements IParameterSet {

    HashMap<String, IParameter> parameters;

    public DefaultCombatParameterSet(IParameter speed) {
        parameters = new HashMap<>();
        parameters.put("Speed", speed);
    }

    @Override
    public IParameter getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameter(String parameterName, IParameter parameter) {

    }

    @Override
    public void setAllParameters(Map<String, IParameter> parameters) {

    }

    @Override
    public String getAllParameters() {
        return null;
    }
}
