package OpenRPG;

import java.awt.*;

public interface Tiled {
    int getTileHeight();
    int getTileWidth();
    void setTileHeight(int height);
    void setTileWidth(int width);
    Graphics getTile(int index);
}
