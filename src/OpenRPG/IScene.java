package OpenRPG;

import OpenRPG.Characters.IGameCharacter;

import java.awt.*;

public interface IScene {
    Point getCharacterLocation(IGameCharacter character);
    Point[] getAllCharacterLocations();
    void setCharacterLocation(IGameCharacter character, Point location);

}
