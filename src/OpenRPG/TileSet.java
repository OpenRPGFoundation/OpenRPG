package OpenRPG;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class TileSet implements Tile{
   Graphics tileSet;

   public TileSet(){

   }

   public TileSet(Graphics img){
      tileSet = img;
   }

   public TileSet(String fileName){
      try {
         tileSet = ImageIO.read(new File(fileName)).getGraphics();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
