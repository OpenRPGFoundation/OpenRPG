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
            int battler1Speed = p1.getValue();
            int battler2Speed = p2.getValue();

            return battler1Speed - battler2Speed;
        }
    };
}
