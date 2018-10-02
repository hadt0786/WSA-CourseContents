package com.emertxe;

import java.io.*;
import java.sql.*;

/**
 * Program Description: This program is to implement checked exception
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac CheckedException.java 
 * Execution: java CheckedException
 * Output:
 */

/* Checked exception is checked by the compiler */

/* IOException and SQLException is example of checked exception */

/* IOEXception is present inside java.io package */

/*
 * in case of checked exception if you write anything after the culprit line
 * then the compile time error is:"unreachable statement but this is not the
 * case in case of unchecked exception
 */

public class CheckedException {

	public static void main(String[] args) {

		// throw new IOException();
		throw new SQLException();

	}

}
