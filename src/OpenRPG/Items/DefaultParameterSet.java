package OpenRPG.Items;

import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public abstract class DefaultParameterSet implements IParameterSet {

    protected Map<String, Integer> parameters;

    public DefaultParameterSet() {
        parameters = new HashMap<>();
    }

    @Override
    public int getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameterValue(String parameter, int value) {
        parameters.put(parameter, value);
    }

    @Override
    public void setAllParameters(Map<String, Integer> parameters) {
        this.parameters = parameters;
    }

    @Override
    public abstract String getAllParameters();
}
