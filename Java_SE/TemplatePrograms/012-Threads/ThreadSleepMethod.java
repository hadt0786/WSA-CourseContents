package com.emertxe;

/**
 * Program Description: this code is to check sleep method and interrupt method
 * 
 * Author: Sandhya
 * Written: 12/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadSleepMethod.java 
 * Execution: java ThreadSleepMethod
 * Output:
 */
class  Test3  extends Thread
{
	public  void  run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupt handled"+e);
			}
			System.out.println(i);
		}
		}
	}
public class ThreadSleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3  t1 =new Test3();
		Test3 t2=new Test3();

		t1.start();
		try
		{
			t1.interrupt();
		}
		catch (Exception e)
		{
		}
		

	}

}
