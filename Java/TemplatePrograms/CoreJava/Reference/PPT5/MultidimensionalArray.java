package com.emertxe;

/**
 * Program Description: This program is to implement multidimensional array in
 * java
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Updated:
 * 
 * Compilation: javac MultidimensioanlArray.java 
 * Execution: java MultidimensionalArray 
 * Output:
 */

public class MultidimensionalArray {

	public static void main(String[] args) {

		/*
		 * array that contains four elements.Each element is a null reference to
		 * an element of type array of int
		 */

		int[][] twoD = new int[4][];

		/* an array of four arrays of five integers each: */

		// int[][] twoDim = new int[4][5];

		/*
		 * initialize each element separately so that each element points to its
		 * array.
		 */

		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];

		int i, j, k = 0;

		for (i = 0; i < 4; i++) {

			for (j = 0; j < i + 1; j++) {

				twoD[i][j] = k;
				k++;
			}
		}

		for (i = 0; i < 4; i++) {

			for (j = 0; j < i + 1; j++) {

				System.out.print(twoD[i][j] + " ");

			}

			System.out.println();
		}

	}

}
