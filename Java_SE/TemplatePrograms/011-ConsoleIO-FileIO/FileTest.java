package com.emertxe;

/**
 * Program description: this program is to show how a File object is created in Java
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac FileTest.java
 * Execution: java FileTest
 * Output:
 */

import java.io.*;

public class FileTest {

	public static void main(String[] args) {

		try {

			File file = new File("newfile.txt");

			if (file.createNewFile()) {

				System.out.println("File is created!");
			}

			else {

				System.out.println("File already exists.");
			}

		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
