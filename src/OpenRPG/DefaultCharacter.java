package OpenRPG;

public class DefaultCharacter implements IGameCharacter {

    protected String name;
    protected IParameters parameters;

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
        return parameters;
    }

    @Override
    public void dealDamage(int damage) {
        parameters.setParameterValue("currentHP", damage);
    }

    public String getName() {
        return name;
    }
}
