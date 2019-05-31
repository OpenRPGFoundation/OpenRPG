package OpenRPG;

import java.util.List;

public interface IParty{
    List<IGameCharacter> getPartyMembers();
    IGameCharacter getCharacter(IGameCharacter character);
    void addPartyMember(IGameCharacter character);
}