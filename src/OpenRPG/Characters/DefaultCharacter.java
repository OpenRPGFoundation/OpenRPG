package OpenRPG.Characters;

import OpenRPG.IParameterSet;

public abstract class DefaultCharacter implements IGameCharacter {

    protected String name;
    protected IParameterSet parameters;

    public DefaultCharacter() {
        this.name = null;
        this.parameters = null;
    }

    public DefaultCharacter(String name, IParameterSet parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    @Override
    public IParameterSet getParameters() {
        return parameters;
    }

    public String getName() {
        return name;
    }
}
