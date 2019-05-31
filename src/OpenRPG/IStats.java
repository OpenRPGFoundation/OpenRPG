package OpenRPG;

import java.util.Map;

public interface IStats {

    int getStat(String statName);

    void setStatValue(String stat, int value);

    void setAllStats(Map<String, Integer> stats);

    String getAllStats();
}
