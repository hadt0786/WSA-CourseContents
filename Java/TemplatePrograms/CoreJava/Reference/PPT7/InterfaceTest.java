package com.emertxe;

/**
 * Program Description: The code is to show how interface is
 * created in Java
 * 
 * Author: Vikas
 * Written: javac InterfaceTest.java
 * Last Updated: java InterfaceTest
 * 
 * Compilation: javac InterfaceTest.java
 * Execution: java InterfaceTest
 * Output: 
 */

/* Interfaces is a pure abstract class */

/* All the method of interface is by default public and abstract */

/* You can create public static final constant inside interface */

interface Vehicle {

	/*according to java naming convention constant should be in CAPITAL case*/
	
	public static final int SPEED = 90;

	public abstract void runVehicle();

}

class Car implements Vehicle {

	public void runVehicle() {

		System.out.println("The car is running");
	}

}

public class InterfaceTest {

	public static void main(String[] args) {

		Car c = new Car();
		c.runVehicle();

	}

}
