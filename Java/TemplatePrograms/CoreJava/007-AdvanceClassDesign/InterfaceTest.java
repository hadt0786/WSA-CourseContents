


/**

*Author: Vikas
*Program Description: The code is to show how interface is created in Java

*/


/* Interfaces is a pure abstract class*/

/*All the method of interface is by default public and abstract*/

/*You can create public static final constant inside interface*/


interface Vehicle{
	
	public static final int SPEED =90;// according to java naminng convention constant should be in CAPITAL case

	public abstract void runVehicle();
	

}


class Car extends Vehicle{


	public void runVehicle(){



		System.out.println("The car is running");
	}

}

public class InterfaceTest{




	public static void main(String[] args){

		Car c = new Car();
		c.runVehicle();		
			
	}

}
