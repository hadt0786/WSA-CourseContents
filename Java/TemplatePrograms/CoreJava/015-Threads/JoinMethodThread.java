package com.emertxe;

/**
 * Program Description: this code is to show the implementation of join()
 * method of Thread class
 * 
 * Author: Sandhya
 * Written: 12/02/2016
 * Last Update:
 * 
 * Compilation: javac JoinMethodThread.java 
 * Execution: java JoinMethodThread
 * Output:
 */


// join() it causes the currently running thread to stop execution 
//untill the thread it joins with completes its task
package ClassWork2;
class  Test4  extends Thread
{
	public  void  run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
				}
			System.out.println(i);
		}
	}
}
public class JoinMethodThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test4  t1 =new Test4();
       Test4  t2=new Test4();
       Test4  t3=new Test4();

       t1.start();
      
       System.out.println("thread is alive "+t1.isAlive());//return true isAlive if thread is running
       System.out.println("thread is alive "+t2.isAlive());
       try
       {
    	   System.out.println("Waiting for threads to finish");
    	  
    	   t1.join();
    	   
    	   
    	   		
       }
       catch(InterruptedException e)
       {
    	   System.out.println("main thread interrupted");
       }
      t2.start();
       t3.start();
       System.out.println("thread is alive "+t1.isAlive());//return true isAlive if thread is running
       System.out.println("thread is alive "+t2.isAlive());
       
	}

}
