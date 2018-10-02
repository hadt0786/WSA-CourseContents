package com.emertxe;

/**
 * Program Description: This program is to show how multiple threads communicate
 * each other
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac InterThreadComm.java 
 * Execution: java InterThreadComm
 * Output:
 */

class Customer {

	public synchronized void withdraw() {

		System.out.println("Customer is going to withdraw money");

		// wait() method halts the execution of current thread

		try {

			wait();// wait() method is present inside Object class

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("withdrawal is completed");

	}

	public synchronized void deposit() {

		System.out.println("Customer is goining to deposit the money");

		System.out.println("Deposit completed");

		// notify() method will notify the the method which is i9n waiting

		notify();// notify() method is present inside Object class

	}

}

class MyThread1 extends Thread {

	Customer c;

	MyThread1(Customer c) {

		this.c = c;

	}

	public void run() {

		c.withdraw();

	}

}

class MyThread2 extends Thread {

	Customer c;

	public MyThread2(Customer c) {

		this.c = c;

	}

	public void run() {

		c.deposit();

	}

}

public class InterThreadComm {

	public static void main(String[] args) {

		Customer c = new Customer();

		MyThread1 t1 = new MyThread1(c);
		MyThread2 t2 = new MyThread2(c);

		t1.start();
		t2.start();

	}

}
