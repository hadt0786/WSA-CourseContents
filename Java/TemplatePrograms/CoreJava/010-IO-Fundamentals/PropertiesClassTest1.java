package com.emertxe;

import java.util.*;

/**
 * Program Description: This program is to show the information of the System
 * properties
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac PropertiesClassTest1.java 
 * Execution: java PropertiesClassTest1 
 * Output:
 */

/* The properties object contains key and value pair both as a string. */
/* Properties file is mainly used to contain variable information */

public class PropertiesClassTest1 {

	public static void main(String[] args) {

		Properties props = System.getProperties();

		// list() method is to list the properties information as key and value
		// pair

		// props.list(System.out);

		// Using the Iterator interface to get key and value of the system
		// properties

		System.out.println("-----------------------------------------");

		Set set = props.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());

		}

	}
}
