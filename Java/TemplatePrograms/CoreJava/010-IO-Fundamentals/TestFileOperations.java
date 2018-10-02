package com.emertxe;
/**
 * Program Description: This program is to show how FileOutputStream  classes are implemented 
 * 
 * Author: Sandhya
 * Written: 09/02/2016
 * Last Update:


FileOutputStream is an output stream for writing data to file*/


import java.io.FileOutputStream;
import java.lang.*;
public class TestFile1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
try
{
	FileOutputStream f1 =new FileOutputStream("ab.txt");
	String s ="Welcome to file handling core java";
	byte b[]=s.getBytes();//converting string into byte array
	f1.write(b);
	f1.close();
	
	System.out.println("File Created");
	
	
	
}catch(FileNotFoundException e)
{
	System.out.println("file not found");
}


		
	}

}
