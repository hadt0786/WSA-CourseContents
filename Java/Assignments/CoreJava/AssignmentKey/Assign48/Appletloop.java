import java.applet.Applet;
import java.awt.Graphics;


public class Appletloop extends Applet 
{

	public void paint(Graphics g)
	{
				g.fillOval(120, 10, 50, 50);
				g.drawOval(190, 10, 50, 50);
				g.drawOval(260, 10, 50, 50);
				g.drawOval(120, 80, 50, 50);
				g.fillOval(190,80,50,50);
				g.drawOval(260, 80,50,50);
				g.drawOval(120, 150, 50, 50);
				g.drawOval(190, 150, 50, 50);
				g.fillOval(260, 150, 50, 50);
				
	}
}
