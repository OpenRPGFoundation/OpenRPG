package OpenRPG.Characters;

import java.util.ArrayList;
import java.util.List;

public class DefaultParty implements IParty {

    private List<Battler> characterList;

    public DefaultParty(){
        characterList = new ArrayList<>();
    }


    public DefaultParty(ArrayList<Battler> characters){
        characterList = characters;
    }

    public DefaultParty(Battler... characters) {
        characterList = new ArrayList<>();

        for (Battler character : characters) {
            characterList.add(character);
        }
    }

    @Override
    public List<Battler> getPartyMembers() {
        return characterList;
    }

    @Override
    public Battler getCharacter(Battler character) {
        return characterList.get(characterList.indexOf(character));
    }

    @Override
    public Battler getCharacterByIndex(int index) {
        return characterList.get(index);
    }

    @Override
    public Battler[] getAllCharacters() {
        return characterList.toArray(Battler[]::new);
    }

    @Override
    public void addPartyMember(Battler character) {
        characterList.add(character);
    }

    @Override
    public void removePartyMember(Battler character) {
        characterList.remove(character);
    }

    @Override
    public void removeMemberByIndex(int index) {
        characterList.remove(index);
    }

    @Override
    public void switchMembers(Battler characterOne, Battler characterTwo) {
        int index1 = characterList.indexOf(characterOne);
        int index2 = characterList.indexOf(characterTwo);

        characterList.add(index1, characterTwo);
        characterList.add(index2, characterOne);
    }

    @Override
    public void switchMembers(int indexOne, int indexTwo) {
        Battler characterOne = getCharacterByIndex(indexOne);
        Battler characterTwo = getCharacterByIndex(indexTwo);

        characterList.add(indexOne, characterTwo);
        characterList.add(indexTwo, characterOne);
    }
}
