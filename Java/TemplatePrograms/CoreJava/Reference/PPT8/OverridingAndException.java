

/**

* Author: Vikas
* Program Description: This program is to show how rules of method overriding works when a method return the Exception

*/

/*if a method return type is exception class then while overriding the return type will be same or the child class of the parent method return type*/



class Vehicle{


	public Exception runVehicle(){

		return new Exception();

	}

}


class Car extends Vehicle{

	public ArithmeticException runVehicle(){


		return new ArithmeticException();	
	}

	
}

public class OverridingAndException{



	public static void main(String[] args){

		
		
	}

}
