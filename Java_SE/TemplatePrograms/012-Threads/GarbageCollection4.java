package com.emertxe;

/**
 * Program Description: the program is to how garbage collection is implemented
 * in java
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac GarbageCollection4.java 
 * Execution: java GarbageCollection4
 * Output:
 * 
 * Reference: "Performing Garbage Collection in Java" Article published in OSFY
 * in January 2015 at page 68
 */

// Type-3: Objects created inside a method
// Example-3

public class GarbageCollection4 {

	static Student s;

	public static void m1() {

		s = new Student();

		Student s1 = new Student();

	}

	public static void main(String[] args) {

		/*
		 * In the above code 's' is a static variable, so although the two
		 * Students objects are created inside a method, only one object which
		 * is referred by 's1' is eligible for garbage collection. The object
		 * that is referred by 's' is eligible for garbage collection because
		 * 's' is a static variable not a local one.
		 */

		m1();

	}

}
