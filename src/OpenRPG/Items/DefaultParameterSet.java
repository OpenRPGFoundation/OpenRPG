package OpenRPG.Items;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameter;
import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public abstract class DefaultParameterSet implements IParameterSet {

    protected Map<String, IParameter> parameters;

    public DefaultParameterSet() {
        parameters = new HashMap<>();
    }

    @Override
    public IParameter getParameter(String parameterName) {
        return parameters.get(parameterName);
    }

    @Override
    public void setParameter(String name, IParameter parameter) {
        parameters.put(name, parameter);
    }

    @Override
    public void setAllParameters(Map<String, IParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public abstract String getAllParameters();
}
