

/**

* Author: Vikas
* Program Description: This code is continuation of AccessControlTest.java file

*/

package com.tom;

import com.emertxe.*;



class AccessControlTest1{



	public static void main(String[] args){

		
		com.emertxe.AccessControlTest ac = new com.emertxe.AccessControlTest();

		//c.carSpeed();// private method is not accessible from other class and other package

		ac.runCar();// public method is accessible from other class and other package

		ac.carModel();// protected method is accessible from other class but only child class can access it from other package
		
		ac.noOfSeats();// default method is accessible from other class and within the same packge but not from other package

	
				
		
	}


}
