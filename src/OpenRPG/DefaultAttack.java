package OpenRPG;

public class DefaultAttack implements Attack, AttackProcessor, Animation{

    private int baseDamage;
    private DamageModifier modifier;

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
    public void dealDamage(IGameCharacter attacker, IGameCharacter defender) {
        int totalDamage = calculateDamage(attacker.getParameters(), defender.getParameters(), modifier);
        defender.dealDamage(totalDamage);
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

    @Override
    public void animate(int frames) {

    }

    @Override
    public void animate(int... frames) {

    }
}
