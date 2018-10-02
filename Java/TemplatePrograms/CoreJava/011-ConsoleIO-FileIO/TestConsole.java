
package com.emertxe;
/**
 * Program Description: This program is to show how to get input from Console
 * 
 * Author: Sandhya
 * Written: 09/02/2016
 * Last Update: 
console is used to get input from console.
it provides methods to read text and password*/


import java.io.Console;

public class TestConsole {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try
		{
 Console c1 =System.console();
 System.out.println("Enter Name");
 String Name=c1.readLine();
 System.out.println("Name    :"+Name);
		}
		catch(Exception e)
		{}
		
 
		
	}

}
