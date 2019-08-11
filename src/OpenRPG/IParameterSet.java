package OpenRPG;

import java.util.Map;

public interface IParameterSet {

    DefaultParameter getParameter(String parameterName);

    void setParameter(String name, DefaultParameter parameter);

    void setAllParameters(Map<String, DefaultParameter> parameters);

    String getAllParameters();
}
