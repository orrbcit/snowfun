
import java.awt.*;

public class Head {
	// -----------------------------------------------------------------
	// Draws a Head with eyes and mouth.
	// -----------------------------------------------------------------
	public Head(int x, int y, Graphics page) {
		page.setColor(Color.white);
		page.fillOval(x - 20, y, 40, 40); // head
		page.setColor(Color.black);
		page.fillOval(x - 10, y + 10, 5, 5); // left eye
		page.fillOval(x + 5, y + 10, 5, 5); // right eye
		page.drawArc(x - 10, y + 20, 20, 10, 190, 160); // smile
	}
}