package com.emertxe;

/**
 * Program Description: This code is show the implementaion of Initialize before
 * use principals
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Updated:
 * 
 * Compilation: javac InitializationBeforeUse.java 
 * Execution: java InitializationBeforeUse 
 * Output: compile time error
 */

class Car {

	public void carSpeed() {

		long speed;

		System.out.println(speed);

	}

}

public class InitializeBeforeUse {

	public static void main(String[] args) {

		Car c = new Car();

	}

}
