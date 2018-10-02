package com.emertxe;

/**
 * Program Detail: the code is to show how the implementation of import test 
 * 
 * Author: Vikas 
 * Written:09/02/2015 
 * Last Updated: 
 * 
 * Compilation: javac ImportTest.java 
 * Execution: java ImportTest 
 * 
 * Prints: Current date and time of the computer
 */

import java.util.*;

/* asterix represents all the java class file inside the package. or import java.util.Date;
 * here there is no asterix, here we are trying to access the specific java class*/

class PrintDate {

	public void printDate() {

		Date d = new Date();

		System.out.println(d);
	}

}

public class ImportTest {

	public static void main(String[] args) {

		PrintDate d = new PrintDate();
		d.printDate();

	}

}
