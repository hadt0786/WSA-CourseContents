package com.tom;

/**
 * Program Description: This Car class consist of static member which is accessed 
 * by StaticImportTest.java class in other file
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Updated: 
 * 
 * Compilation: javac Car.java
 * Execution: java StaticImportTest
 * Output: 
 */

public class Car {

	public static void m1(){
		
		System.out.println("static method");
		
	}
	
	public void m2(){
		
		System.out.println("non static method");
		
	}
}
