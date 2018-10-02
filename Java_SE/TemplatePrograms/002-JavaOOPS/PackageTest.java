
/**

* Author: Vikas
* Program Detail: the code is to show how the package is created and how it is compiled using -d 

*/

package com.emertxe;

/* the packgae name is com.emertxe, the significant of the packge is to avoid byte code collison, this program will create two byte as we have two class ddefined in the source file, both the byte code will go inside com.emertxe package after compilation*/


class Car{


	public void runCar(){

		System.out.println("The car is running");
	}

}

public class PackageTest{


	public static void main(String[] args){

		Car c = new Car();
		c.runCar();		
		
	}


}
