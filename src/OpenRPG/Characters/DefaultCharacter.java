package OpenRPG.Characters;

import OpenRPG.IParameterSet;

public abstract class DefaultCharacter implements IGameCharacter {

    protected String name;

    public DefaultCharacter() {
        this.name = null;
    }

    public DefaultCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
