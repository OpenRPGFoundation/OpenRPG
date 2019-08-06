package OpenRPG;

public class DefaultCharacter implements IGameCharacter {

    private String name;
    private IParameters parameters;

    DefaultCharacter() {
        this.name = null;
        this.parameters = null;
    }

    DefaultCharacter(String name, IParameters parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public IParameters getParameters() {
        return null;
    }

    @Override
    public void dealDamage(int damage) {

    }
}
