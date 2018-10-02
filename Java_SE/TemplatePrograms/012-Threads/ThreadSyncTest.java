package com.emertxe;

/**
 * Program Description: This program is to show how we implements
 * synchronization in java
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadSyncTest.java 
 * Execution: java ThreadSyncTest 
 * Output:
 */

class Table {

	synchronized public void createTable(int a) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(a * i);

			try {

				Thread.sleep(20);

			}

			catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}

class MyThread1 extends Thread {

	Table t1 = null;

	MyThread1(Table t1) {

		this.t1 = t1;

	}

	public void run() {

		t1.createTable(5);

	}

}

class MyThread2 extends Thread {

	Table t2 = null;

	MyThread2(Table t2) {

		this.t2 = t2;

	}

	public void run() {

		t2.createTable(6);

	}

}

public class ThreadSyncTest {

	public static void main(String[] args) {

		Table t = new Table();

		MyThread1 t1 = new MyThread1(t);

		MyThread2 t2 = new MyThread2(t);

		t1.start();
		t2.start();

	}

}
