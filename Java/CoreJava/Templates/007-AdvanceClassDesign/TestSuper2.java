// Example of super keyword
// Author :Sandhya
class Vehicle8
{
	Vehicle8()
	{
		System.out.println("Vehicle is running");
		
	}
		
}
class Car5 extends Vehicle8
{
	
	Car5()
	{
		super();
		System.out.println("car is running");
	}
   
}

class TestSuper1
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car5 c1=new Car5();

	}

}
