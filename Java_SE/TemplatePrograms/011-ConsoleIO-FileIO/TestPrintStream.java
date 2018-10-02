package com.emertxe;
/**
 * Program Description: This program is to show how PrintStream  classes are implemented 
 * 
 * Author: Sandhya
 * Written: 09/02/2016
 * Last Update:


 PrintStream class provides methods to write data to another stream*/

import java.io.*;
public class TestPrintStream {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
 FileOutputStream fout =new FileOutputStream("data.txt");
 PrintStream p1 = new PrintStream(fout);
 p1.print("Name");
  
 p1.print("  Marks" );
 p1.println("----------------------");
 p1.close();
 fout.close();
		
	}

}   
