package com.emertxe;

/**
 * Program Description: this code is to show the implementation of yield()
 * method of Thread class
 * 
 * Author: Sandhya
 * Written: 12/02/2016
 * Last Update:
 * 
 * Compilation: javac YieldMethodThread.java 
 * Execution: java YieldMethodThread
 * Output:
 */

//yield() method -currently executing thread to temporarily pauses and 
//allow other thread to execute
package ClassWork2;
class Test5 extends Thread
{
	public void run()
	{
		System.out.println("thread 1");
		for(int i=1;i<=5;i++)
		{   if(i==3)
		{
			Thread.yield();
			System.out.println(i);
		}
		}
		
	}
}
class Test8 extends Thread
{
	public void run()
	{
		System.out.println("thread 2");
		for(int i=5;i<=10;i++)
		{   
			System.out.println(i);	
		}
		
	}
}

public class YieldmethodThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 t1 =new  Test5();
		t1.start();
		Test8 t6 =new  Test8();
		t6.start();
	}

}
