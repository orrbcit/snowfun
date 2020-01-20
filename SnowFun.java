import javax.swing.JApplet;
import java.awt.*;

public class SnowFun extends JApplet
{
   //-----------------------------------------------------------------
   //  Draws a snowman.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      final int x1 = 100;
      final int y1 = 50;
      final int x2 = 200;
      final int y2 = 50;

      // background
      setBackground (Color.cyan);
      page.setColor (Color.blue);
      page.fillRect (0, 175, 300, 50);  // ground
      page.setColor (Color.yellow);
      page.fillOval (-40, -40, 80, 80);  // sun

      Showman man1 = new Showman (100, 50, page);
      Sportsman man2 = new Sportsman (200, 50, page);
      Sportsman man3 = new Sportsman (300, 30, page);
      

   }
}