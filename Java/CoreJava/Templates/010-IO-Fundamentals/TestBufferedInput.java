package com.emertxe;
/**
 * Program Description: This program is to show how BufferedInputStream  classes are implemented 
 * 
 * Author: Sandhya
 * Written: 09/02/2016
 * Last Update:*/ 
import java.io.*;
public class TestBufferedInput {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileInputStream f2=new FileInputStream("ab.txt");
		//BufferedInputStream b2=new BufferedInputStream(f2);
		
		int i;
		
		while((i=f2.read())!=-1)
		{
			System.out.println((char)i);
		}
		//b2.close();
		f2.close();
	}

}
