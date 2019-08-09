package OpenRPG.Characters;

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

    @Override
    public void removePartyMember(IGameCharacter character) {
        characterList.remove(character);
    }

    @Override
    public void removeMemberByIndex(int index) {
        characterList.remove(index);
    }

    @Override
    public void switchMembers(IGameCharacter characterOne, IGameCharacter characterTwo) {
        int index1 = characterList.indexOf(characterOne);
        int index2 = characterList.indexOf(characterTwo);

        characterList.add(index1, characterTwo);
        characterList.add(index2, characterOne);
    }

    @Override
    public void switchMembers(int indexOne, int indexTwo) {
        IGameCharacter characterOne = getCharacterByIndex(indexOne);
        IGameCharacter characterTwo = getCharacterByIndex(indexTwo);

        characterList.add(indexOne, characterTwo);
        characterList.add(indexTwo, characterOne);
    }
}
