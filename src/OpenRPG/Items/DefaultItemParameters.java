package OpenRPG.Items;

import OpenRPG.IParameters;

import java.util.HashMap;
import java.util.Map;

public class DefaultItemParameters implements IParameters {

    Map<String, Integer> parameters;

    public DefaultItemParameters() {
        parameters = new HashMap<>();
    }

    public DefaultItemParameters(int potency, int value) {
        parameters = new HashMap<>();
        parameters.put("potency", potency);
        parameters.put("value", value);
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
    public String getAllParameters() {
        return null;
    }
}
