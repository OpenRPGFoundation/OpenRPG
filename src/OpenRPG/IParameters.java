package OpenRPG;

import java.util.Map;

public interface IParameters {

    int getParameter(String statName);

    void setParameterValue(String stat, int value);

    void setAllParameters(Map<String, Integer> stats);

    String getAllParameters();
}
