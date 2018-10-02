package com.emertxe;

/**
 * Program Detail: The code is to show how jvm executes the static members in
 * case inheritance
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Updated:
 * 
 * Compilation: javac JVMInternalExample2.java 
 * Execution: java JVMInternalExample2 
 * Output:
 * 
 * Reference:"Java Virtual Machine Delving Deep into its Architecture" Article
 * published in OSFY in December 2014 at page 55
 */

/*
 * the order of identification and execution of static members in case of
 * inheritance will from top to bottom or from parent class to child class
 */

class Vehicle {

	static int a = m1();

	public static int m1() {

		System.out.println("In Vehicle m1");
		return 10;

	}

	static {

		System.out.println("Vehicle static block");

	}

}

class Car extends Vehicle {

	static int b = m2();

	public static int m2() {

		System.out.println(" In Car m2");
		return 10;

	}

	static {

		System.out.println("Car static block");

	}

	public static void main(String[] args) {

		System.out.println("In main");

	}

}
