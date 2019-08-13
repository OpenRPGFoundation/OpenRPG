package OpenRPG.Characters;

import OpenRPG.DefaultBattle;

import java.util.List;

public interface IParty{
    List<Battler> getPartyMembers();
    Battler getCharacter(Battler character);
    Battler getCharacterByIndex(int index);
    Battler[] getAllCharacters();
    void addPartyMember(Battler character);
    void removePartyMember(Battler character);
    void removeMemberByIndex(int index);
    void switchMembers(Battler characterOne, Battler characterTwo);
    void switchMembers(int indexOne, int indexTwo);

}
