package com.emertxe;

/**
 * Program Description: This program is to show how the garbage collection in
 * java is performed
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac GarbageCollection2.java 
 * Execution: java GarbageCollection2
 * Output:
 * 
 * Reference: "Performing Garbage Collection in Java" Article published in OSFY
 * in January 2015 at page 68
 */

/*
 * Type-3: Performing garbage collection by creating object inside a method
 */

// Example-1

class Student {

}

public class GarbageCollection2 {

	public static void m1() {

		Student s1 = new Student();

		Student s2 = new Student();

	}

	public static void main(String[] args) {

		/*
		 * the moment m1() method finishes its execution, the local variables s1
		 * and s2 are no longer available. hence there is no reference variable
		 * at all pointing to either of the two Student objects, in that case
		 * the above two Student object becomes eligible for garbage collection
		 */

		m1();

	}

}
