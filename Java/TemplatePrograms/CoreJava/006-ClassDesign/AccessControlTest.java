

/**
* Author: Vikas
* Program description: the program is show the uses of Access control in Java
*/


package com.emertxe;

public class AccessControlTest{

	// using private access modifier
	
	private void carSpeed(){

		System.out.println("private: Accessible within the same class where it is created");
	}	
	
	// using public access modifier

	public void runCar(){

		System.out.println("public: Accessible within the class, outside the class and from the other package classes also");
		
	}

	// uisng protected access modifier

	protected void carModel(){

		System.out.println("protected: Accessible within the class as well as from the child class living anywhere");
		
	}
	
	// uisng default access modifier

	void noOfSeats(){

		System.out.println("default: Accessible within the same package where it is created");					
	} 


}



 class AccessTest{


	public static void main(String[] args){

		
		AccessControlTest ac = new AccessControlTest();
		//c.carSpeed();// private method is not accessible from other class

		ac.runCar();// public method is accessible from other class

		ac.carModel();// protected method is accessible from other class
		
		ac.noOfSeats();// default method is accessible from other class
	
				
		
	}

}


/*AccessControlTest1.java file is the continuation program of this program*/



