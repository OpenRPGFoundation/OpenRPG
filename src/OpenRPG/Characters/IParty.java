package OpenRPG.Characters;

import java.util.List;

public interface IParty{
    List<IGameCharacter> getPartyMembers();
    IGameCharacter getCharacter(IGameCharacter character);
    IGameCharacter getCharacterByIndex(int index);
    void addPartyMember(IGameCharacter character);
    void removePartyMember(IGameCharacter character);
    void removeMemberByIndex(int index);
    void switchMembers(IGameCharacter characterOne, IGameCharacter characterTwo);
    void switchMembers(int indexOne, int indexTwo);
}
