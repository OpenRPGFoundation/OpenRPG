package OpenRPG;

import java.awt.*;

public interface Collidable {
    void detectCollision(Collidable object);
    Point getLocation();

}
