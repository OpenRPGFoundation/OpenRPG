package OpenRPG.Characters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DefaultParty implements IParty {

    private List<DefaultBattler> characterList;

    public DefaultParty(){
        characterList = new ArrayList<>();
    }


    public DefaultParty(ArrayList<DefaultBattler> characters){
        characterList = characters;
    }

    @Override
    public List<DefaultBattler> getPartyMembers() {
        return characterList;
    }

    @Override
    public DefaultBattler getCharacter(DefaultBattler character) {
        return characterList.get(characterList.indexOf(character));
    }

    @Override
    public DefaultBattler getCharacterByIndex(int index) {
        return characterList.get(index);
    }

    @Override
    public DefaultBattler[] getAllCharacters() {
        return characterList.toArray(DefaultBattler[]::new);
    }

    @Override
    public void addPartyMember(DefaultBattler character) {
        characterList.add(character);
    }

    @Override
    public void removePartyMember(DefaultBattler character) {
        characterList.remove(character);
    }

    @Override
    public void removeMemberByIndex(int index) {
        characterList.remove(index);
    }

    @Override
    public void switchMembers(DefaultBattler characterOne, DefaultBattler characterTwo) {
        int index1 = characterList.indexOf(characterOne);
        int index2 = characterList.indexOf(characterTwo);

        characterList.add(index1, characterTwo);
        characterList.add(index2, characterOne);
    }

    @Override
    public void switchMembers(int indexOne, int indexTwo) {
        DefaultBattler characterOne = getCharacterByIndex(indexOne);
        DefaultBattler characterTwo = getCharacterByIndex(indexTwo);

        characterList.add(indexOne, characterTwo);
        characterList.add(indexTwo, characterOne);
    }
}
