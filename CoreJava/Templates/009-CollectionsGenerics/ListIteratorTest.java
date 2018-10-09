package com.emertxe;
import java.util.*;

/**
 * Program Description: This program is show how we traverse the List object from last to first 
 * and first to last with the help of ListIterator interface
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac ListIteratorTest.java
 * Execution: java ListIteratorTest
 * Output: 
 */

// ListIterator interface is present inside the java.util package

class ListIteratorTest {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Trainer");
		al.add("Admin");
		al.add("Sales");
		al.add("Operation");

		System.out.println("from first to last --------------");

		/*listIterator() method return the handle of ListIterator*/
		
		ListIterator li1 = al.listIterator();

		while (li1.hasNext()) {

			System.out.println(li1.next());
		}

		System.out.println("from last to first -------------------");

		while (li1.hasPrevious()) {

			System.out.println(li1.previous());

		}

	}

}
