// Inheritance Example 
// Author :Sandhya
class Vehicle5   // Vehicle5 is super class
{
	String Color;
	int speed;
	int size;
	void disp()
	{
		System.out.println("Color"+Color);
		System.out.println("Speed"+speed);
		System.out.println("size"+size);
		
	}
}

class car6 extends Vehicle5  // car6 is subclass
{
	int gears;
	void dispcardetail()
	{
		System.out.println("Color"+Color);
		System.out.println("Speed"+speed);
		System.out.println("size"+size);
		System.out.println("No of gears"+gears);
		
	}
	
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car6 c1=new car6();//c1 is object of car6
		c1.Color="blue";//dot operator is used to access the member of class
		c1.speed=200;
		c1.size=22;
		c1.gears=5;
		
		c1.dispcardetail();
	}

	
}
