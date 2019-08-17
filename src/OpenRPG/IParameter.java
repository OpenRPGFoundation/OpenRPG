package OpenRPG;

import java.util.Comparator;

public interface IParameter {
    public static Comparator<IParameter> compareParameter = new Comparator<IParameter>() {
        @Override
        public int compare(IParameter p1, IParameter p2) {
            int parameter1 = p1.getValue();
            int parameter2 = p2.getValue();

            return  parameter2 - parameter1;
        }
    };

    int getValue();
    void setValue(int value);
}
