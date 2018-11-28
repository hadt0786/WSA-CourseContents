package com.emertxe;

/**
 * Program Description: This program is to show the example of
 * un-checked exception
 * 
 * Author: Vikas 
 * Written: 09/02/2015
 * Last Update:
 * 
 * Compilation: javac UnCheckedException.java
 * Execution: java UnCheckedException
 * Output:
 */

class UnCheckedException {

	public static void main(String args[]) {

		int sum = 0;

		for (String arg : args) {

			sum += Integer.parseInt(arg);
		}

		System.out.println("Sum = " + sum);
	}
}
