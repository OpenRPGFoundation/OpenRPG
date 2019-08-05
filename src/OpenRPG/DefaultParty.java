package OpenRPG;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DefaultParty implements IParty {

    private List<IGameCharacter> characterList;

    public DefaultParty(){
        characterList = new ArrayList<>();
    }


    public DefaultParty(ArrayList<IGameCharacter> characters){
        characterList = characters;
    }

    @Override
    public List<IGameCharacter> getPartyMembers() {
        return characterList;
    }

    @Override
    public IGameCharacter getCharacter(IGameCharacter character) {
        return characterList.get(characterList.indexOf(character));
    }

    @Override
    public IGameCharacter getCharacterByIndex(int index) {
        return characterList.get(index);
    }

    @Override
    public void addPartyMember(IGameCharacter character) {
        characterList.add(character);
    }
}
