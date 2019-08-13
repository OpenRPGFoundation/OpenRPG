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

    public static Comparator<DefaultParameter> compareParameter = new Comparator<DefaultParameter>() {
        @Override
        public int compare(DefaultParameter p1, DefaultParameter p2) {
            int parameter1 = p1.getValue();
            int parameter2 = p2.getValue();

            return  parameter2 - parameter1;
        }
    };
}
