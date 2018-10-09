package com.emertxe;

/**
 * Program Description: This program is to show how user defined
 * exception is created
 * 
 * Author: Vikas 
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac UDException.java
 * Execution: java UDException
 * Output: negative age exception:-25
 */

class NegativeAgeException extends Exception {

	int age;

	NegativeAgeException(int age) {

		this.age = age;
	}

	public String toString() {

		return "negative age exception:" + age;
	}

}

class UDException {

	public static void main(String[] args) throws NegativeAgeException {

		int age = -25;

		if (age <= 0) {

			throw new NegativeAgeException(age);

		}

		else {

			System.out.println("your age is" + age);
		}
	}
}
