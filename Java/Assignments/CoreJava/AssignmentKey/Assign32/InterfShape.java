/*Implement the classes for the shapes using an interface for the common methods, rather  than inheritance from the superclass, while still Shape as a base class.
*/
import java.util.*;
interface  Figure  
{
final float pi=3.14f;
void area();
}
class Shapes
{
	double radius,length,breadth;
	Scanner sc=new Scanner(System.in);
	void readr()
	{
		System.out.println("enter the radius");
		radius=sc.nextDouble();
	}
	void readlb()
	{
		System.out.println("enter the length and breadth");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
			}
	
}
class Circles extends Shapes implements Figure
{

public void area() {
	System.out.println("area of circle="+pi*radius*radius);
}
}
class Rect extends Shapes implements Figure
{
public void area()
{
System.out.println("area of rectangle="+(length*breadth));
}
}

public class InterfShape {

	public static void main(String[] args) {
		Figure fg;
		Rect r = new Rect();
		r.readlb();
		fg = r;
		fg.area();
		Circles c=new Circles();
		c.readr();
		fg=c;
		fg.area();
				}
}

	
