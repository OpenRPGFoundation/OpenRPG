package OpenRPG;

public class DefaultPlayer extends DefaultCharacter implements Healable, Levelable, Moveable, Animation {

    DefaultPlayer(String name, IParameters parameters) {
        super(name, parameters);
    }

    @Override
    public void animate(int frames) {

    }

    @Override
    public void animate(int... frames) {

    }

    @Override
    public void move() {

    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getExp() {
        return 0;
    }

    @Override
    public void increaseLevel() {

    }

    @Override
    public void addExperience(int exp) {

    }

    @Override
    public void heal(int amount) {
        int oldHP = parameters.getParameter("currentHP");
        int newHP = oldHP + amount;
        parameters.setParameterValue("currentHP", newHP);
    }
}
