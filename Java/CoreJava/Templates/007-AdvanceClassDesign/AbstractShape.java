// Example of Abstract class
// Author :Sandhya

abstract class shape // abstract class
{
	void draw()
	{
		System.out.println("draw");
	}
	//abstract method 
}

class Rectangle extends shape
{
	void draw()
	{
		//System.out.println("drawing rectangle");
	}
}
class Circle1 extends shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       shape a1 =new Rectangle();
		  Rectangle r1 =new Rectangle();
		  Circle1 c1 =new Circle1();
		  
		  a1.draw();
		  r1.draw();
		  c1.draw();
	}

}
