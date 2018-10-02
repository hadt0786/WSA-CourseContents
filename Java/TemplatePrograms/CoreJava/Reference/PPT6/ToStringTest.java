package com.emertxe;

/**
 * Program Description: this program is to show the implementation
 * of toString() method
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac ToStringTest.java
 * Execution: java ToString
 * Output: 
 */

// run this example before commenting toString method and after commenting
// toString method to know the difference

class Car {

	public String toString() {

		return "Car object";

	}

}

public class ToStringTest {

	public static void main(String[] args) {

		Car c = new Car();

		System.out.println(c);

	}

}
