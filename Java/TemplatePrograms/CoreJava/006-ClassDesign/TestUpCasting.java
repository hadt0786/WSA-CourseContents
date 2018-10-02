//  Program Description : Example of  upcasting 
// Author :Sandhya
class Vehicle9
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Car9 extends Vehicle9
{
	void run()
	{
	System.out.println("car is running");
	}
}
public class TestUpCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle9 v1=new Car9();
    v1.run();
		
	}

}
