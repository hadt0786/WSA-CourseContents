package com.emertxe;

/**
 * Program Description: The program is to show how garbage collection is
 * performed by creating a object inside a method and calling a method that
 * returns object
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac GarbageCollection3.java 
 * Execution: java GarbageCollection3
 * Output: 
 * 
 * Reference: "Performing Garbage Collection in Java" Article published in OSFY
 * in January 2015 at page 68
 */

// Type-3: Objects created inside a method
// Example -2

class Student {

}

public class GarbageCollection3 {

	public static Student m1() {

		Student s1 = new Student();
		Student s2 = new Student();

		return s1;

	}

	public static void main(String[] args) {

		/* 
		 * In the above code, we that method m1() returns the s1 object, so even
		 * though s1 is a local variable, it exits even after the m1() finishes
		 * its execution but s2 is not returned by the m1() so once the m1()
		 * finishes its execution, s2 does not exits any more. Hence the code
		 * above inside m1() makes only one object eligible for garbage
		 * collection(referred by s2)
		 */

		Student s = m1();

		/*
		 * when we don't hold the return type of m1() method then both object
		 * defined above in the m1() method becomes eligible for garbage
		 * collection
		 */

		m1();

	}

}
