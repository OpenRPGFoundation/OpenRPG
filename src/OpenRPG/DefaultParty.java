package OpenRPG;

import java.util.ArrayList;
import java.util.List;

public class DefaultParty implements IParty {

    List<IGameCharacter> characterList;

    public DefaultParty(List<IGameCharacter> characters){

    }

    @Override
    public List getPartyMembers() {
        return null;
    }

    @Override
    public IGameCharacter getCharacter(IGameCharacter character) {
        return null;
    }

    @Override
    public void addPartyMember(IGameCharacter character) {

    }
}
