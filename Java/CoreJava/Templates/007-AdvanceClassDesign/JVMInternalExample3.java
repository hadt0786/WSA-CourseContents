package com.emertxe;

/**
 * Program Description: This program is to show how JVM executes the static,
 * non-static and constructor
 * 
 * Author: Vikas 
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac JVMInternalExample3.java
 * Execution: java JVMInternalExample3
 * Output: 
 * 
 * Referece:"Java Virtual Machine Delving Deep into its Architecture" Article 
 * published in OSFY in December 2014 at page 55
 */

/*
 * 
 * static members are both identified and excuted first Instance
 * member(no-static variables and non-static methods) are identified and
 * executed only if the instance is created. The order of execution for instance
 * member will be from top to bottom Constructor are always executed last
 */

public class JVMInternalExample3 {

	static int a = m1();

	int b = m2();

	{

		System.out.println("Insatance block");

	}

	public int m2() {

		System.out.println("in m2");
		return 10;

	}

	static {

		System.out.println("in static block");

	}

	public static int m1() {

		System.out.println("in m1");
		return 10;
	}

	public JVMInternalExample3() {

		System.out.println("in constructor");

	}

	public static void main(String[] args) {

		System.out.println("In main");
		JVMInternalExample3 j = new JVMInternalExample3();

	}

}
