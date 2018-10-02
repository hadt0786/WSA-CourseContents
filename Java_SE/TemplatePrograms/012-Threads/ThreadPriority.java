package com.emertxe;

/**
 * Program Description: this code is to set the priority
 * method of Thread class
 * 
 * Author: Sandhya
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadPriority.java 
 * Execution: java ThreadPriority
 * Output:
 */

class Test1 extends Thread
{
	public void run()
	{
		int i;
		for (i=1;i<=2;i++)
		{
			System.out.println(i);
		}
	}
}


class Test11 extends Thread
{
	public void run()
	{
		int i;
		for (i=5;i<=6;i++)
		{
			System.out.println(i);
		}
	}
}

class Test12 extends Thread
{
	public void run()
	{
		int i;
		for (i=7;i<=8;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1  t1=new Test1();
		
		Test11  t2=new Test11();
		Test12  t3=new Test12();
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("after setting priority");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
			}

}
