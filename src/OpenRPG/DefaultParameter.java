package OpenRPG;

import java.util.Comparator;

public class DefaultParameter implements IParameter {

    int value;

    public DefaultParameter() {
        value = 0;
    }

    public DefaultParameter(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
