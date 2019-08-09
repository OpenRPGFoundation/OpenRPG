package OpenRPG;

public abstract class DefaultCharacter implements IGameCharacter {

    protected String name;
    protected IParameters parameters;

    public DefaultCharacter() {
        this.name = null;
        this.parameters = null;
    }

    public DefaultCharacter(String name, IParameters parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public IParameters getParameters() {
        return parameters;
    }

    public String getName() {
        return name;
    }
}
