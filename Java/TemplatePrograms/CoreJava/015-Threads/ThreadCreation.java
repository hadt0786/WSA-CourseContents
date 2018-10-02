package com.emertxe;

/**
 * Program Description: This is program is to show how java threads are created
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Updated:
 * 
 * Compilation: javac ThreadCreation.java 
 * Execution: java ThreadCreation 
 * Output:
 */

// Thread class is present inside java.lang package

// Creating Thread object by extending Thread class

class MyThread extends Thread {

	// run() method is present inside Thread class

	public void run() {

		System.out.println("Thread is running");

	}

}

public class ThreadCreation {

	public static void main(String[] args) {

		MyThread t = new MyThread();// Thread object is created

		t.start();// start method is present inside Thread class

	}

}

// Creating thread object by implementing Runnable interface

/*class MyRunnable implements Runnable {

	// run() method is present inside Runnable interface

	public void run() {

		System.out.println("Implementing Runnable interface");

	}

}

public class ThreadCreation {

	public static void main(String[] args) {

		MyRunnable mr = new MyRunnable();

		Thread t = new Thread(mr);

		t.start();// start method is present inside Thread class

	}

}
*/