package com.emertxe;

/**
 * Program Dscription: This program is to show how a method return an Array
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac ReturningArrayFromMethods.java
 * Execution: java ReturningArrayFromMethods
 * Output: 
 */

public class ReturningArrayFromMethods {

	public static int[] reverse(int[] list) {

		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {

			result[j] = list[i];

		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = reverse(new int[] { 1, 2, 3, 4, 5 });

		for (int a = 0; a < arr.length; a++) {

			System.out.println(arr[a]);

		}

	}

}
