import javax.swing.JApplet;
import java.awt.*;

public class Showman extends Snowman
{
   //-----------------------------------------------------------------
   //  Draws a Showman.  Inherits the snowman constructor.
   //  Has a unique hat.
   //-----------------------------------------------------------------
   public Showman (int x, int y, Graphics page)
   {
      super(x, y, page);
      drawHat(x, y, page);
   }
   
   //----------------------
   // Draw a top-hat.
   //-----------------------
   private void drawHat(int x, int y, Graphics page){
	      page.drawLine (x-20, y+5, x+20, y+5);  // brim of hat
	      page.fillRect (x-15, y-20, 30, 25);        // top of hat
   }
   
}