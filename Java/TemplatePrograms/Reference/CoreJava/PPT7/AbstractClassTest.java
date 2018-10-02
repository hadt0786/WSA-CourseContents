


/**

* Author: Vikas
* Program Description: This program is to show how abstrtact class is created

*/

/* You can create variables, method and abstract method inside abstract class*/

/* You cann't create the object of abstract class*/

/* abstract class must be extended from a concreate class for its completion*/


abstract class Vehicle{



	int speed=90;
	
	public abstract void selfStart();

	public abstract void keyStart();

	
	public void start(){

	}


}

class Car extends Vehicle{

	
	public void selfStart(){

		System.out.println("You can start the car by button");	
	}

	public void keyStart(){

		System.out.println("You can start the car by key");	
	}

	
	public void start(){

		keyStart();
		selfStart();
	}
}


public class AbstrtactClassTest{


	public static void main(String[] args){

		Car c = new Car();

		c.start();				
	}	


}
