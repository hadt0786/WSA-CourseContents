
/*
 * Develop an applet that receives three numeric values as input from the user and then
displays the largest of the three on the screen. Write a HTML pages and test the applet.

 */
import java.awt.*;
import java.applet.*;
public class Appletlarge extends Applet
{
  TextField num1,num2,num3;
  public void init()
  {
	num1=new TextField(9);
	num2=new TextField(9);
	num3=new TextField(9);

	add(num1);
	add(num2);
	add(num3);
	num1.setText("0");
	num2.setText("0");
	num3.setText("0");
  }
    public void paint(Graphics g)
   {
	int x=0,y=0,z=0,large;
	String n1,n2,n3,m;
	g.drawString("Input number in each box", 10, 50);
	try
	{
		n1=num1.getText();
		x=Integer.parseInt(n1);
		n2=num2.getText();
		y=Integer.parseInt(n2);
		n3=num3.getText();
		z=Integer.parseInt(n3);
		
	}
	catch(Exception e)
	{
		
	}
	if(x > y && x>z)
	{
	large=x;
	}
	else if(y > z)
	{
	large=y;
	}	
	else
	{
	large=z;
	}
	System.out.println(large);
	m=String.valueOf(large);
	g.drawString("greatest of three numbers is", 10, 75);
	g.drawString(m, 300, 75);
		
   }
	public boolean action(Event event, Object obj)
 	{
		repaint();
		return true;
	}
}
