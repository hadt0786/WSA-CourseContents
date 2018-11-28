package com.emertxe;
import java.util.*;
import java.io.*;

/**
 * Program Description: This program is to show how to create a properties file and how to access the file
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac PropertiesClassTest2.java
 * Execution: java PropertiesClassTest2
 * Output: 
 */



public class PropertiesClassTest2 {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();

		// public void setProperty(String key,String value): sets the properties
		// in the properties object

		p.setProperty("name", "Vikash Kumar");
		p.setProperty("email", "vikash_kumar@emertxe.com");

		// public void store(Writer w, String comment): store() method writes
		// the properties in the writer object

		p.store(new FileWriter("/home/vikash/Desktop/info.properties"),
				"Properties file creation example");

	}

}
