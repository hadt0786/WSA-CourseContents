package com.emertxe;

import java.util.*;
import java.io.*;

/**
 * Program Description: This is to show how we get the information from
 * properties file by passing key
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac PropertiesClassTest3.java 
 * Execution: java PropertiesClassTest3 
 * Output:
 */

public class PropertiesClassTest3 {

	public static void main(String[] args) throws IOException {

		/*// reading the properties file using FileReader class*/
		
		FileReader reader = new FileReader("info.properties");

		Properties p = new Properties();
		p.load(reader); // loading the from Reader object

		// getProperty() method return value based on the key

		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("email"));

	}

}