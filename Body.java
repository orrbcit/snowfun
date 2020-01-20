import javax.swing.JApplet;
import java.awt.*;

public class Body  {
	// -----------------------------------------------------------------
	// Draws a Body with arms.
	// -----------------------------------------------------------------
	public Body(int x, int y, Graphics page) {
		  page.setColor(Color.white);
	      page.fillOval (x-35, y+35, 70, 50);   // upper torso
	      page.fillOval (x-50, y+80, 100, 60);  // lower torso
		  page.setColor(Color.black);
	      page.drawLine (x-25, y+60, x-50, y+40);  // left arm
	      page.drawLine (x+25, y+60, x+55, y+60);  // right arm
	}
}