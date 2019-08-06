package OpenRPG;

import java.util.Map;

public interface IParameters {

    int getParameter(String parameterName);

    void setParameterValue(String parameter, int value);

    void setAllParameters(Map<String, Integer> parameters);

    String getAllParameters();
}
