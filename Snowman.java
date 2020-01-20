import java.awt.*;

public class Snowman 
{
	Head head;
	Body body;
	
   //-----------------------------------------------------------------
   //  Create a snowman. Only has a head, has a body, has arms.
   //-----------------------------------------------------------------
   public Snowman (int x, int y, Graphics page)
   {
		System.out.println("Snowman: x, y are .." + x + " "+ y);

      head = new Head(x, y, page);
      body = new Body(x, y, page);
   }
}