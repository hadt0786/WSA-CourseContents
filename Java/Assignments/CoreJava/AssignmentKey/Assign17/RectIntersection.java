/* The intersection method computes the intersection of two rectangles- that is, the  rectangle that is formed by two overlapping rectangles:  You call this method as follows:  Rectangle r3 =r1.intersection(r2);   Write a program that constructs two rectangle objects, prints them, and then prints their  intersection. What happens when the rectangles do not overlap? */
import java.awt.Rectangle;
import java.applet.*;
public class RectIntersection extends Applet
{
    public static void main(String[] args)
    {
	Rectangle r1 = new Rectangle(0, 0, 10, 10); 
	Rectangle r2 = new Rectangle(5, 5, 10, 10); 
	Rectangle r3 = r1.intersection(r2); 
	System.out.println(r1); 
	System.out.println("intersected with"); 
	System.out.println(r2); 
	System.out.println("produces"); 
	System.out.println(r3);   
        System.out.println("----------------------");  
 	Rectangle r4 = new Rectangle(10, 10, 10, 10); 
	Rectangle r5 = new Rectangle(50, 50, 50, 50); 
	Rectangle r6 = r4.intersection(r5); 
	System.out.println(r4); 
	System.out.println("intersected with"); 
	System.out.println(r5); 
	System.out.println("produces"); 
	System.out.println(r6); 
        
    } 
}
