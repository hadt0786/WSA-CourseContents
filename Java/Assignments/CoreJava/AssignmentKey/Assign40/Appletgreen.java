import java.applet.Applet;
import java.awt.*;
public class Appletgreen extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.GREEN);
		g.setColor(Color.blue);
		g.fillRect(10, 10, 300, 150);
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 150, 150);
		g.setColor(Color.yellow);
		g.fillOval(159, 10, 150, 150);
		g.setColor(Color.red);
		g.drawString("www.emertxe.com", 110, 90);
	}
	
}
