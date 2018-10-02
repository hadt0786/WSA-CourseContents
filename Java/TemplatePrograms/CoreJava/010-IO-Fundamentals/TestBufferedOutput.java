package com.emertxe;
/**
 * Program Description: This program is to show how BufferedOutputStream  classes are implemented 
 * 
 * Author: Sandhya
 * Written: 09/02/2016
 * Last Update:

 java BufferedOutPutStream class uses an internal buffer to store data*/


import java.io.*;
public class TestBufferedOutput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    FileOutputStream f1=new FileOutputStream("ab.txt");
    
    //BufferedOutputStream b1= new BufferedOutputStream(f1);
    String s="Welcome to java world";
    byte b[] =s.getBytes();
    f1.write(b);
    
    f1.flush();
    //b1.close();
    f1.close();
    System.out.print("byeee");
	}

}
