package OpenRPG;

import java.util.List;

public interface IParty{
    List<IGameCharacter> getPartyMembers();
    IGameCharacter getCharacter(IGameCharacter character);
    IGameCharacter getCharacterByIndex(int index);
    void addPartyMember(IGameCharacter character);
}
