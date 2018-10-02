package com.emertxe;

/**
 * Program Detail: the code is to show the how garbage collection is performed
 * in Java
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac GarbageCollection1.java 
 * Execution: java GarbageCollection1
 * Output:
 * 
 * Reference: "Performing Garbage Collection in Java" Article published in OSFY
 * in January 2015 at page 68
 */

class Student {

	// code comes here

}

public class GarbageCollection1 {

	public static void main(String[] args) {

		/*
		 * Type-1: Performing garbage collection in java using nullifying the
		 * reference variables
		 */

		/*
		 * In the code below, we can see two objects of Student(s1, s2). when we
		 * create a second object of the same, it is obvious that you don't need
		 * the first object in that case, it is highly recommended that the
		 * previous object is made eligible for garbage collection so we use
		 * "s1=null" to make the previous object eligible for garbage collection
		 */

		Student s1 = new Student();

		Student s2 = new Student();

		s1 = null;// one object eligible for garbage collection

		/*
		 * Type-2: Performing garbage collection in java using re-assigning the
		 * reference variables
		 */

		// Student s1 = new Student();// first object

		// Student s2 = new Student();// second object

		// creating third object

		// s1 = new Student(); // first object eligible for garbage collection

		// s2 = s1;// second object becomes eligible for garbage collection

	}

}
