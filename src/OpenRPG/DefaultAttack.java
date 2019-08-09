package OpenRPG;

import OpenRPG.Characters.DefaultBattler;
import OpenRPG.Characters.DefaultCharacter;
import OpenRPG.Characters.IGameCharacter;

public class DefaultAttack implements Attack, Animation{

    private String attackName;
    private int baseDamage;
    private Modifier damageModifier;

    DefaultAttack(String name){

        attackName = name;
        baseDamage = 1;
        damageModifier = new Modifier();
    }

    DefaultAttack(String name, int baseDamage){

        attackName = name;
        this.baseDamage = baseDamage;
        damageModifier = new Modifier();
    }

    DefaultAttack(String name, int baseDamage, Modifier damageModifier){

        attackName = name;
        this.baseDamage = baseDamage;
        this.damageModifier = damageModifier;
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
    public void dealDamage(DefaultBattler attacker, Damageable defender) {
        DefaultCharacter temp = (DefaultCharacter) defender;
        int totalDamage = calculateDamage(attacker.getParameters(), temp.getParameters(), damageModifier);
        defender.damage(totalDamage);
    }

    @Override
    public int calculateDamage(IParameters attackerStats, IParameters defenderStats, Modifier modifier) {
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
