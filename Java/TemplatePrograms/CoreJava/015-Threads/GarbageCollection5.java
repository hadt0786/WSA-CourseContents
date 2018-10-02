package com.emertxe;

/**
 * Program Description: This is is show how garbage collection is performed in
 * java
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac GarbageCollection5.java 
 * Execution: java GarbageCollection5
 * Output:
 * 
 * Reference: "Performing Garbage Collection in Java" Article published in OSFY
 * in January 2015 at page 68
 */

// Type-4: Island of isolation

// Draw the diagram to explain this program

class Test {

	Test i;
}

class GarbageCollection5 {

	public static void main(String[] args) {

		// creating three objects

		Test t1 = new Test();

		Test t2 = new Test();

		Test t3 = new Test();

		/*
		 * Assigning the reference of all the three objects to each object's
		 * instance variable
		 */

		t1.i = t2;
		t2.i = t3;
		t3.i = t1;

		// Assigning null to the reference variable

		t1 = null;// no object eligible for garbage collection

		t2 = null;// no object eligible for garbage collection

		t3 = null; // all three objects are now eligible for garbage collection

	}

}
