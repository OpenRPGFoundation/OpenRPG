package OpenRPG;

public class DefaultAttack implements Attack, AttackProcessor{

    private int baseDamage;

    DefaultAttack(){
        baseDamage = 1;
    }

    DefaultAttack(int baseDamage){
        this.baseDamage = baseDamage;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public void animateAtack() {

    }

    @Override
    public void dealDamage() {

    }

    @Override
    public int calculateDamage(IParameters attackerStats, IParameters defenderStats, DamageModifier modifier) {
        int attack = attackerStats.getParameter("Attack") + baseDamage - defenderStats.getParameter("Attack");
        attack = modifier.modify(attack);

        if (attack < 0) {
            attack = 0;
        }

        return attack;
    }
}
