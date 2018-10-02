package com.emertxe;

import java.util.*;

/**
 * Program Description: This program is to show how we create List object and
 * List interface implementation
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac ListTest.java 
 * Execution: java ListTest 
 * Output:
 */

/*
 * List iterface is the child interface of Collection interface of collection
 * framework
 */

// List interface is present inside java.util package

public class ListTest {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");// duplicate, is added
		list.add(new Integer(4)); // duplicate, is added
		System.out.println(list);

	}

}
