package com.emertxe;

/**
 * Program Description: This program is to show the implementation
 * of various operators of Java
 * 
 * Author: Vikas 
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac OperatorTest.java 
 * Execution: java OperatorTest
 * Output: Run the program and check the output one by one for each operator
 */

public class OperatorTest {

	public static void main(String[] args) {

		// logical or boolean operators and short-circuit operators example

		boolean x = true;
		boolean y = false;

		// logical operator or boolean operator
		
		System.out.println("x & y : " + (x & y));
		
		// short circuit logical operator
		
		System.out.println("x && y : " + (x && y));
		
		// logical operator or boolean operator

		System.out.println("x | y : " + (x | y));
		
		// short circuit logical operator
		
		System.out.println("x || y: " + (x || y));
		
		// logical operators or boolean operator
		
		System.out.println("x ^ y : " + (x ^ y));
		System.out.println("!x : " + (!x));

	}

}
