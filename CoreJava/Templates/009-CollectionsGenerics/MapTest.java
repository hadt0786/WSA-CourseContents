package com.emertxe;

import java.util.*;

/**
 * Program Description: this program is show the Map interface implementation
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac MapTest.java 
 * Execution: java MapTest 
 * Output:
 */

/* Map interface is not part of collection framework */

public class MapTest {

	public static void main(String[] args) {

		Map map = new HashMap();// HashMap is the child class of Map interface
		map.put("one", "1st");
		map.put("second", new Integer(2));
		map.put("third", "3rd");
		map.put("third", "III");
		Set set1 = map.keySet();
		Collection collection = map.values();
		Set set2 = map.entrySet();
		System.out.println(set1 + "\n" + collection + "\n" + set2);

	}

}
