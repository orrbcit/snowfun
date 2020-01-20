import java.awt.*;

public class Sportsman extends Snowman
{
   //-----------------------------------------------------------------
   //  Draws a Sportsman.  Inherits the snowman constructor.
   //  Has a unique hat.
   //-----------------------------------------------------------------
   public Sportsman (int x, int y, Graphics page)
   {
      super(x, y, page);
      drawHat(x, y, page);
   }
   
   //----------------------
   // Draw a baseball cap
   //-----------------------
   private void drawHat(int x, int y, Graphics page){
 		  page.setColor(Color.green);
	      page.drawLine (x-20, y+5, x+40, y+5);  	 // brim of hat
	      page.fillOval (x-15, y-20, 30, 25);        // top of hat
   }
   
}