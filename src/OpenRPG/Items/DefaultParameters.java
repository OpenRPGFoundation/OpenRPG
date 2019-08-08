package OpenRPG.Items;

import OpenRPG.IParameters;

import java.util.HashMap;
import java.util.Map;

public abstract class DefaultParameters implements IParameters {

    protected Map<String, Integer> parameters;

    public DefaultParameters() {
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
