import java.applet.*;
import java.awt.*;
public class AppletBullEye extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillOval(450, 400, 200,200);
		g.setColor(Color.BLACK);
		g.fillOval(455,405,190,190);
		g.setColor(Color.white);
		g.fillOval(470, 420, 160,160);
		g.setColor(Color.BLACK);
		g.fillOval(485,435,130,130);
		g.setColor(Color.white);
		g.fillOval(505, 455, 90,90);
		g.setColor(Color.BLACK);
		g.fillOval(520,470,60,60);
	}
}
