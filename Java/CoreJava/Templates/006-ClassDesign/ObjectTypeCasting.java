



/**


* Author: Vikas
* Program Description: the code is to show the implementation of object type casting in Java

*/


class Vehicle{


	public void runVehicle(){


		System.out.println("the vehicle is running");
	}	

}

class Car extends Vehicle{


	public void carSpeed(){

		System.out.println("the car is running at 300km/h");
	}

	
	public void runVehicle(){

		System.out.println("the car is running");
	}
	
}


public class ObjectTypeCasting{



	public static void main(String[] args){

		
		Vehicle v = new Car();// parent reference pointing to child object
		
		v.runVehicle();
		//v.carSpeed();	// compile time error as carSpped() method is not present inside Vehicle class
	
		

		Car c = (Car)v;// object type casting(explicit)
		
		c.carSpeed();		
			
	}

}
