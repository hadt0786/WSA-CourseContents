/*
Design a class Circle and implement the following methods: 
       Define a circle method to compute its area 
       Define a circle method to compute its perimeter 
       Define a method that takes a given point represented by a pair of numbers and   checks whether or not the point is inside the circle. 
The circle class needs to have instance variables to store the radius of the circle, and the x  and y coordinates of the center. Add main program to test the class Circle repeatedly,  until user enters negative value for the radius of the circle. (Circles.java)
*/
import java.util.*;
 class Find
{
 	double r, c1, c2;
	Scanner sc = new Scanner(System.in);
	double area(double r)
	{
	 this.r = r;
	 return(3.14*r*r);
	}
	double perimeter(double p)
	{
	 this.r = r;
	 return(2*3.14*r);
	}
	void check(double c1,double c2,double r)
	{
	 this.c1 = c1;
	 this.c2 = c2;
	 this.r = r;
	 double p1,p2;
	 System.out.println("enter pair of numbers to check  whether or not point is inside the circle");
	 p1 = sc.nextDouble();
	 p2 = sc.nextDouble();
	 double m = Math.pow(p1-c1,2);
	 double n = Math.pow(p2-c2,2);
         System.out.println();
         double check = Math.sqrt(m+n);
            if (check < r)
 	    {
                System.out.println("Point lies inside the Circle");
            }
              else
	     {
                System.out.println("Point lies outside the Circle");
            }
        }
}
public class Circles
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 double radius,x,y;
	 Find f = new Find();
	 System.out.println("enter the radius");
	 radius = sc.nextDouble();
	 do
	 {
	  System.out.println("enter the x,y coordinates of center");
	  x = sc.nextDouble();
          y = sc.nextDouble();
          f.check(x,y,radius);
          System.out.println("area of circle= "+ f.area(radius));
          System.out.println("Perimeter of circle= " + f.perimeter(radius));
          System.out.println("enter the radius");
	  radius = sc.nextDouble();
 	 }while (radius > 0);
        }
}



