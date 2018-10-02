/*Write a program to make use of a parameterized method inside a class. Take the  following case: Create a class Box and define a method in this class which will return the  volume of the box. Initialize two objects for your class and print out the volumes  respectively.*/
public class Box
{
	int l, b, h;
	Box(int l,int b, int h)
	{
	  this.l = l;
	  this.b = b;
  	  this.h = h;
	  System.out.println(l*b*h);
	}
	 public static void main(String args[])
	 {
	   System.out.println("Volume of first box");
	   Box bx1 = new Box(2,3,4);
	   System.out.println("Volume of second box");
	   Box bx2 = new Box(5,6,8);
	 }
}
