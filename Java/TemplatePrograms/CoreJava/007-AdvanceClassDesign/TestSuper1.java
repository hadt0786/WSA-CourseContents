// Example of super Keyword
// Author :Sandhya

class Vehicle2
{
	int speed=50;
}

class car4 extends Vehicle2
{
	int speed=100;
	
	void disp()
	{
		System.out.println(super.speed);// will print speed of Vehicle
	}
}
public class TestSuper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car4 c3=new car4();
		c3.disp();

	}

}

