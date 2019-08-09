package OpenRPG.Items;

import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public class DefaultHealingItemParameterSet extends DefaultParameterSet {

    public DefaultHealingItemParameterSet() {
        super();
        parameters.put("potency", 0);
        parameters.put("value", 0);
    }

    @Override
    public String getAllParameters() {
        return null;
    }

    public DefaultHealingItemParameterSet(int potency, int value) {
        super();
        parameters.put("potency", potency);
        parameters.put("value", value);
    }

    public int getPotency() {
        return getParameter("potency");
    }

    public int getValue() {
        return parameters.get("value");
    }
}
