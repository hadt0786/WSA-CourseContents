package com.emertxe;

import java.net.*;
import java.io.*;

/**
 * Program Description: This program is to show the implementation of
 * client-server programming
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac ServerTest.java 
 * Execution: java ServerTest 
 * Output:
 */

public class ServerTest {

	public static void main(String args[]) {

		ServerSocket s = null;

		// Register your service on port 5432

		try {

			s = new ServerSocket(5432);

		}

		catch (IOException e) {

			e.printStackTrace();

		}

		while (true) {

			try {

				// Wait here and listen for a connection

				Socket s1 = s.accept();

				// Get output stream associated with the socket

				OutputStream s1out = s1.getOutputStream();

				BufferedWriter bw = new BufferedWriter(

				new OutputStreamWriter(s1out));

				// Send your string!

				bw.write("Hello Net World!\n");

				// Close the connection, but not the server socket

				bw.close();
				s1.close();
			}

			catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}

class SimpleClient {

	public static void main(String args[]) {
		try {

			/*
			 * Open your connection to a server, at port 5432, local host used
			 * here
			 */

			Socket s1 = new Socket("127.0.0.1", 5432);

			// Get an input stream from the socket

			InputStream is = s1.getInputStream();

			// Decorate it with a "data" input stream

			DataInputStream dis = new DataInputStream(is);

			// Read the input and print it to the screen

			System.out.println(dis.readUTF());

			// When done, just close the steam and connection

			dis.close();

			s1.close();
		}

		catch (ConnectException connExc) {
			System.err.println("Could not connect.");
		}

		catch (IOException e) {

		}
	}
}
