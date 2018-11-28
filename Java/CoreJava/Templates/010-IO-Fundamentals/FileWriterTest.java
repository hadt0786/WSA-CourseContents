package com.emertxe;
import java.io.*;

/**
 * Program Description: This program is to implement FileWriter class of java.io package
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update:
 * 
 * Compilation: javac FileWriterTest.java
 * Execution: java FileWriterTest
 * Output: 
 */

//Java FileWriter class is used to write character-oriented data to the file.

public class FileWriterTest {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {

			fw = new FileWriter("test.txt");

			/* write method is used to write the content on the file
			 * write is present inside Writer class of java.io package*/
			
			fw.write("My Name is Khan");

		}

		catch (IOException e) {

			e.printStackTrace();

		}

		finally {

			try {

				fw.close();
			}

			catch (Exception e) {

				e.printStackTrace();

			}

			System.out.println("Success");

		}

	}

}
