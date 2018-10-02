import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
 
public class House extends Applet
{  
   public void paint(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D)g;
 
      final double WIDTH = 100;
      final double HEIGHT = 150;
 
      double x = 0;
      double y = 200;
 
      Rectangle2D.Double front = new Rectangle2D.Double(x, y - WIDTH, WIDTH, WIDTH);
 
      Rectangle2D.Double door = new Rectangle2D.Double(x + WIDTH / 5, y - WIDTH / 2, WIDTH / 5, WIDTH / 2);
 
      Rectangle2D.Double window = new Rectangle2D.Double(x + WIDTH * 3 / 5, y - WIDTH / 2, WIDTH / 5, WIDTH / 5);
 
      Line2D.Double roofLeft = new Line2D.Double(x, y - WIDTH, x + WIDTH / 2, y - HEIGHT);
 
      Line2D.Double roofRight = new Line2D.Double(x + WIDTH, y - WIDTH, x + WIDTH / 2, y - HEIGHT);
 
      g2.draw(front);
      g2.draw(door);
      g2.draw(window);
      g2.draw(roofLeft);
      g2.draw(roofRight);
   }
}
 
