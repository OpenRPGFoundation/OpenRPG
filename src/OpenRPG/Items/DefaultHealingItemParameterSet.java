package OpenRPG.Items;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameterSet;

import java.util.HashMap;
import java.util.Map;

public class DefaultHealingItemParameterSet extends DefaultParameterSet {

    public DefaultHealingItemParameterSet() {
        super();
        parameters.put("potency", new DefaultParameter());
        parameters.put("value", new DefaultParameter());
    }

    @Override
    public String getAllParameters() {
        return null;
    }

    public DefaultHealingItemParameterSet(int potencyValue, int baseValue) {
        super();
        DefaultParameter potency = new DefaultParameter(potencyValue);
        DefaultParameter value = new DefaultParameter(baseValue);
        parameters.put("potency", potency);
        parameters.put("value", value);
    }

    public int getPotency() {
        return getParameter("potency").getValue();
    }

    public int getValue() {
        return parameters.get("value").getValue();
    }
}
