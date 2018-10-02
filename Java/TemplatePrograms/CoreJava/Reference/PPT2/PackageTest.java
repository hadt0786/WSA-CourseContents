package com.emertxe;

/**
 * Program Detail: the code is to show how the package is created and how it is
 * compiled using -d 
 * 
 * Author: Vikas 
 * Written:09/02/2015 
 * Last Updated: 
 * 
 * Compilation: javac PackageTest.java 
 * Execution: java PackageTest 
 * 
 * Prints: The car is running
 */

class Car {

	public void runCar() {

		System.out.println("The car is running");
	}

}

public class PackageTest {

	public static void main(String[] args) {

		Car c = new Car();
		c.runCar();

	}

}