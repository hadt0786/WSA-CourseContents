import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JOptionPane;
 
public class AppletClock extends Applet
 {  
  public void init()
    { 
 	String input  = JOptionPane.showInputDialog("Enter time as hh:mm");
 
        hours = Integer.parseInt(input.substring(0, 2));
 
        minutes = Integer.parseInt(input.substring(3, 5));
    }
    public void paint(Graphics g)
	{  
		Graphics2D g2 = (Graphics2D)g;
 	
	      final double RADIUS = 100;
	      final double MIN_HAND_LENGTH = 90;
      	      final double HOUR_HAND_LENGTH = 80;
 
	      Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 2 * RADIUS, 2 * RADIUS);
      	      g2.draw(circle);
 
      	      final double MINUTES_PER_HOUR = 60;
              final double MINUTES_PER_360 = 60 * 12;
 
      	      double minAngle = Math.PI / 2 - 2 * Math.PI * minutes / MINUTES_PER_HOUR;
 
     	      Line2D.Double minHand = new Line2D.Double(RADIUS, RADIUS,
              RADIUS + MIN_HAND_LENGTH * Math.cos(minAngle),
              RADIUS - MIN_HAND_LENGTH * Math.sin(minAngle));
 
     	      double hourAngle = Math.PI / 2 - 2 * Math.PI * (hours * MINUTES_PER_HOUR + minutes) / MINUTES_PER_360;
 
              Line2D.Double hourHand = new Line2D.Double(RADIUS, RADIUS,
              RADIUS + HOUR_HAND_LENGTH * Math.cos(hourAngle),
              RADIUS - HOUR_HAND_LENGTH * Math.sin(hourAngle));
 
    		  g2.draw(minHand);
      		  g2.draw(hourHand);
       }
  
   		private int hours;
  		private int minutes;
 }
 
