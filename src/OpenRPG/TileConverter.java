package OpenRPG;

import java.awt.*;

/**
 * A utility that assists in determining pixel and image location data in grid format
 * games.
 * <p>
 * @author  Matthew Norton
 * @version 0.1.0
 * @since   2019-06-02
 * @see Tiled
 * @see TileSet
 */

public class TileConverter {

    public static Point convertToTile(int x, int y, int height, int width){
        return null;
    }

    public static Point convertToTile(Point location){
        return null;
    }

    public static Point convertFromTile(int x, int y){
        return null;
    }

    /*********************************************************************************
     * Determines the location of the top left pixel for a tile given the tile's
     * height, width, and a Point that represents the tile's location in a matrix.
     * *******************************************************************************
     */
    public static Point convertFromTile(Point location, int tileHeight, int tileWidth){


        int y = location.y * tileHeight;
        int x = location.x * tileWidth;

        return new Point(x, y);
    }

    static Point getTileLocation(int index, int totalWidth, int tileWidth) {

        int y = index / (totalWidth / tileWidth);
        int x = index % (totalWidth / tileWidth);
        return new Point(x,y);
    }

}
