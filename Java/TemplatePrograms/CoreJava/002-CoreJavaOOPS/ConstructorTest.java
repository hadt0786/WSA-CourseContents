package com.emertxe;

/**
 * Program Description: This program is to show the how constructor works in
 * java
 * 
 * Author: Vikas 
 * Written: 12/02/2015 
 * Last Update:
 * 
 * Compilation: javac ConstructorTest.java 
 * Execution: java ConstructorTest
 * Output:
 * */

class Vehicle {

	// Defining default constructor

	Vehicle() {

		System.out.println("Vehicle");

	}

}

class Car extends Vehicle{

	// Defining default constructor

	Car() {

		System.out.println("Car");

	}

	// Defining parameterized constructor

	Car(int a) {

		System.out.println("Parameterised Constructor");

	}

}

public class ConstructorTest {

	public static void main(String[] args) {

		Car c1 = new Car();// calling the default constructor
		Car c2 = new Car(5);// calling the parameterized constructor

	}

}
