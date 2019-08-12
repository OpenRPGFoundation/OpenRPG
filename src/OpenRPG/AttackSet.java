package OpenRPG;

import java.util.ArrayList;

public class AttackSet {

    private ArrayList<Attack> attacks = new ArrayList<>();



    public Attack getAttack(int index) {
        return attacks.get(index);
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }

}
