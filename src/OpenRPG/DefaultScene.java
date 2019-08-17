package OpenRPG;

import OpenRPG.Characters.IGameCharacter;

import java.awt.*;

public class DefaultScene implements IScene{


    @Override
    public Point getCharacterLocation(IGameCharacter character) {
        return null;
    }

    @Override
    public Point[] getAllCharacterLocations() {
        return new Point[0];
    }

    @Override
    public void setCharacterLocation(IGameCharacter character, Point location) {

    }
}
