import java.applet.*;
import java.awt.*;
public class AppletFace extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(40, 40, 300, 310); // draw circle
		g.drawOval(120, 130, 10, 10); //draw left eye
		g.drawOval(260,130,10,10);    //draw right eye
		g.drawLine(120,250,260,250);  //draw line as mouth
		
	}

}
