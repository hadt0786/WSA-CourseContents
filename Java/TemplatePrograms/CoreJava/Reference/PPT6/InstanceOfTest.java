package com.emertxe;

/**
 * Program Description: The program is show the implementation of
 * instanceOf operator
 * 
 * Author : Vikas
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac InstanceOfTest.java
 * Execution: java InstanceOfTest
 * Output:  
 */

public class InstanceOfTest {

	public static void main(String[] args) {

		String s = "Hello";

		if (s instanceof java.lang.String) {

			System.out.println("s is instance of java.lang.String");
		}
	}

}
