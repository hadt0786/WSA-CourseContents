/*
 * Write applets to draw the following shapes:
a). Cone
c). Square inside a circle
b).Cylinder
d). Circle inside square
 */
import java.applet.*;
import java.awt.*;
public class AppletDraw extends Applet
{
	
	public void paint(Graphics g)
	{
		//draw Cylinder
		g.drawOval(50,60,100,50); 
		g.drawLine(50,80,50,200);
		g.drawLine(150,80,150,200); 
		g.drawOval(50,180,100,50);
		
		//draw square inside circle
		g.drawOval(10, 600, 150, 155);
		g.drawRect(45, 630, 80, 80);
		
		//draw circle inside square
		g.drawRect(10, 300, 150, 150);
		g.drawOval(35, 330, 90, 95);
		
		//draw Cone
		 g.drawOval(300,60,280,60); 
        	 g.drawLine(300,90,430,280);
         	 g.drawLine(430,280,580,90);
	
	}
	

}
