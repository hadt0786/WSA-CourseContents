package com.emertxe;

import java.io.*;
import java.sql.*;

/**
 * Program Description: This program is show the implementation of checked
 * exception with try and catch block
 * 
 * Author: Vikas Written: 09/02/2015 Last Update:
 * 
 * Compilation: javac CheckedExcWithTryCatch.java 
 * Execution: java CheckedExcWithTryCatch 
 * Output:
 */

/*
 * if programmer give the try and catch block then the compiler doesn't show any
 * error
 */

public class CheckedExcWithTryCatch {

	public static void main(String[] args) {

		try {

			throw new IOException();
			// throw new SQLException();

		}

		catch (IOException ie) {

			System.out.println(ie);
		}

	}

}
