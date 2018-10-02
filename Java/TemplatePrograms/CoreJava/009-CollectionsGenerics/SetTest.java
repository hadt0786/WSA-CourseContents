package com.emertxe;
import java.util.*;

/**
 * Program Description: This program is to show how Set is created
 * and implemented in Java
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac SetTest.java
 * Execution: java SetTest
 * Output:
 */

/*
 * Set: it is interface in Collection framework API. Set is the child interface
 * of Collection interface of collection framework API
 */

/* Set doesn't store duplicate element */

/* Set interface is present inside java.util package */

public class SetTest {

	public static void main(String[] args) {

		Set set = new HashSet();// HashSet is the child class of Set interface
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");// duplicate, not added
		set.add(new Integer(4)); // duplicate, not added
		System.out.println(set);
	}

}
