package OpenRPG.Characters;

import OpenRPG.DefaultBattle;

import java.util.List;

public interface IParty{
    List<DefaultBattler> getPartyMembers();
    DefaultBattler getCharacter(DefaultBattler character);
    DefaultBattler getCharacterByIndex(int index);
    DefaultBattler[] getAllCharacters();
    void addPartyMember(DefaultBattler character);
    void removePartyMember(DefaultBattler character);
    void removeMemberByIndex(int index);
    void switchMembers(DefaultBattler characterOne, DefaultBattler characterTwo);
    void switchMembers(int indexOne, int indexTwo);

}
