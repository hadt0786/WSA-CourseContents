package com.emertxe;

/**
 * Program Description: this code is to use runnable interface
 * 
 * Author: Sandhya
 * Written: 12/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadRunnable.java 
 * Execution: java ThreadRunnable
 * Output:
 */
class Test2 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running");
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2  t1  =new  Test2();
		Thread t2=new Thread(t1);
		
		t2.start();

	}

	
}
