package OpenRPG;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TileSet implements Tiled{
   Graphics tileSet;
   int tileWidth, tileHeight;


   public TileSet(){

   }

   public TileSet(Graphics img, int height, int width){
      tileSet = img;
      tileHeight = height;
      tileWidth = width;
   }

   public TileSet(String fileName, int height, int width){
      try {
         tileSet = ImageIO.read(new File(fileName)).getGraphics();
          tileHeight = height;
          tileWidth = width;
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

    @Override
    public int getTileHeight() {
        return tileHeight;
    }

    @Override
    public int getTileWidth() {
        return tileWidth;
    }

    @Override
    public void setTileHeight(int height) {

    }

    @Override
    public void setTileWidth(int width) {

    }

    @Override
    public Graphics getTile(int index) {

       Point location = TileConverter.getTileLocation(index, tileSet.getClipBounds().width, tileWidth);
       Point firstPixel = TileConverter.convertFromTile(location, tileHeight, tileWidth);

       return tileSet.create(firstPixel.x, firstPixel.y, tileWidth, tileHeight);
    }
}
