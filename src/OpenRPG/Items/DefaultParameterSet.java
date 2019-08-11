package OpenRPG.Items;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public abstract class DefaultParameterSet implements IParameterSet {

    protected Map<String, DefaultParameter> parameters;

    public DefaultParameterSet() {
        parameters = new HashMap<>();
    }

    @Override
    public DefaultParameter getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameter(String name, DefaultParameter parameter) {
        parameters.put(name, parameter);
    }

    @Override
    public void setAllParameters(Map<String, DefaultParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public abstract String getAllParameters();
}
