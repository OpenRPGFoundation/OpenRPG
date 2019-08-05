package OpenRPG;

public class DefaultAttack implements Attack, AttackProcessor, Animation{

    private String attackName;
    private int baseDamage;
    private DamageModifier modifier;

    DefaultAttack(String name){

        attackName = name;
        baseDamage = 1;
        modifier = new DamageModifier();
    }

    DefaultAttack(String name, int baseDamage){

        attackName = name;
        this.baseDamage = baseDamage;
        modifier = new DamageModifier();
    }

    DefaultAttack(String name, int baseDamage, DamageModifier modifier){

        attackName = name;
        this.baseDamage = baseDamage;
        this.modifier = modifier;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String getAttackName() {
        return attackName;
    }

    @Override
    public void dealDamage(IGameCharacter attacker, IGameCharacter defender) {
        int totalDamage = calculateDamage(attacker.getParameters(), defender.getParameters(), modifier);
        defender.dealDamage(totalDamage);
    }

    @Override
    public int calculateDamage(IParameters attackerStats, IParameters defenderStats, DamageModifier modifier) {
        int attack = attackerStats.getParameter("Attack") + baseDamage - defenderStats.getParameter("Defense");
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
