package OpenRPG;

import java.util.Map;

public interface IParameterSet {

    IParameter getParameter(String parameterName);

    void setParameter(String name, IParameter parameter);

    void setAllParameters(Map<String, IParameter> parameters);

    String getAllParameters();
}
