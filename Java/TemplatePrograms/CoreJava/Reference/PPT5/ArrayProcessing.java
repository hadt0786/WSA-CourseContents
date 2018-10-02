package com.emertxe;

/**
 * Program Description: This program is to show the prossing of array
 * element(addition of element, finding the largest no of element etc)
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac ArrayProcessing.java
 * Execution: java ArrayProcessing
 * Prints: 
 */

public class ArrayProcessing {

	public static void main(String[] args) {

		double[] myList = { 1.9, 2.9, 3.4, 3.5 };

		// Print all the array elements

		for (int i = 0; i < myList.length; i++) {

			System.out.println(myList[i] + " ");

		}

		// Summing all elements

		double total = 0;

		for (int i = 0; i < myList.length; i++) {

			total += myList[i];

		}

		System.out.println("Total is " + total);

		// Finding the largest element

		double max = myList[0];

		for (int i = 1; i < myList.length; i++) {

			if (myList[i] > max)
				max = myList[i];

		}

		System.out.println("Max is " + max);

	}

}
