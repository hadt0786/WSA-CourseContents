

/**

* Author: Vikas
* Program Description: This code is to show example of pass by reference in java

*/


class Bus{

	
	public void runBus(){

		System.out.println("Bus is running");

	}
}

class Car{


	public void runCar(Bus b){


		System.out.println("Car is running");
	}
}

public class PassByReference{


	public static void main(String[] args){

		Bus b = new Bus();
		Car c = new Car();

		c.runCar(b);	

	}

}
