package com.emertxe;

/**
 * Program Description: this code is to show the implementation of sleep()
 * method of Thread class
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac SleepMethodTest.java 
 * Execution: java SleepMethodTest
 * Output:
 */

/*
 * sleep() method based on our requirement we can make a thread to be in
 * sleeping state for a specified period of time
 */

class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(5 * i);

			try {

				sleep(1000);// sleep() method is present inside Thread class
			}
			// sleep() method throws InterruptedException
			catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

}

public class SleepMethodTest {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();

	}

}

// testing the sleep() method in multiple threads

/*
 * This program is to show the implementation of sleep() method when two threads
 * executing. When one thread goes to sleep, other thread is executed
 */

/*class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(5 * i);

			try {

				sleep(1000);// sleep() method is present inside Thread class
			}
			// sleep() method throws InterruptedException
			catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

}

public class SleepMethodTest {

	public static void main(String[] args) {

		// creating two object of the thread class

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.start();
		t2.start();

	}

}*/
