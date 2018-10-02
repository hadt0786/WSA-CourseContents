package com.emertxe;

/**
 * Program Description: This program is to show the implementation of yield()
 * method of Thread class
 * 
 * Author: Vikas
 * Written: 11/02/2015
 * Last Update: 
 * 
 * Compilation: javac YieldMethodTest.java
 * Execution: java YieldMethodTest
 * Output:
 */

/*
 * yield() method pauses the currently executing thread temporarily for giving a
 * chance to the remaining waiting threads of the same priority to execute. If
 * there is no waiting thread or all the waiting threads have a lower priority
 * then the same thread will continue its execution.
 */

class MyThread1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(5 * i);

			yield();

		}

	}

}

class MyThread2 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(6 * i);

		}

	}

}

public class YieldMethodTest {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();

		MyThread2 t2 = new MyThread2();

		t1.start();

		t2.start();

	}

}
