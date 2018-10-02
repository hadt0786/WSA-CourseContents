package com.emertxe;

/**
 * Program Description: This program is to show how Buffered Streams classes are implemented 
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac BufferedReaderTest.java 
 * Execution: java BufferedReaderTest
 * Output:
 */

// Implementing BufferedWriter class

import java.io.*;

public class BufferedWriterTest {

	public static void main(String[] args) {

		FileWriter fr = null;
		BufferedWriter br = null;

		try {

			fr = new FileWriter("test.txt");

			br = new BufferedWriter(fr);

			br.write("Using BufferedWriter class");

		}

		catch (IOException e) {

			e.printStackTrace();

		}

		finally {

			try {

				br.flush();// flush before closing the connection
				br.close();
				fr.close();

			}

			catch (IOException e) {

				e.printStackTrace();

			}

			System.out.println("Success...");

		}

	}

}
