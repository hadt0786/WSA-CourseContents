package com.tom;

import com.emertxe.*;

/**
 * Program Description: This code is continuation of AccessControlTest.java file
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Updated:
 * 
 * Compilation: javac AccessControlTest1.java 
 * Execution: java AccesscontrolTest1
 * Output:
 */

class AccessControlTest1 {

	public static void main(String[] args) {

		com.emertxe.AccessControlTest ac = new com.emertxe.AccessControlTest();

		/* private method is not accessible from other class and other package */

		// c.carSpeed();

		/* public method is accessible from other class and other package */

		ac.runCar();

		/*
		 * protected method is accessible from other class but only child class
		 * can access it from other package
		 */

		// ac.carModel();

		/*
		 * default method is accessible from other class and within the same
		 * packge but not from other package
		 */

		// ac.noOfSeats();

	}

}
