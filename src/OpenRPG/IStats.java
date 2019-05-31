package OpenRPG;

import java.util.Map;

public interface IStats {

    int getStat(String statName);

    void setStats(Map<String, Integer> stats);

    String getAllStats();
}
