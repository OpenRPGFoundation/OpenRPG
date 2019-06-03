package OpenRPG;

public class DefaultAttack implements Attack, AttackProcessor{

    int baseDamage;

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
    public int calculateDamage(IStats attackerStats, IStats defenderStats, DamageModifier modifier) {
        int attack = attackerStats.getStat("Attack") + baseDamage - defenderStats.getStat("Attack");
        attack = modifier.modify(attack);

        if (attack < 0) {
            attack = 0;
        }

        return attack;
    }
}
