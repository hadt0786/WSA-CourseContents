package com.emertxe;

/**
 * Program description: This program is to show how we name threads in java
 * 
 * Author: Vikas 
 * Written: 11/02/2015 
 * Last Update:
 * 
 * Compilation: javac ThreadNaming.java 
 * Execution: java ThreadNaming 
 * Output:
 */

// Displaying the name of the default thread

/* Each java program has a one by default thread running always */

/* The by default thread of java will handle the main function of java */

class DefaultThread {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
	}

}

// Naming threads in java

/* Naming a Thread by setName method of Thread class */

class MyThread extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());

	}

}

class ThreadNaming {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.setName("Vikas");
		t.start();

	}

}

/* Naming thread by Thread class constructor: Thread(String) */

/*class MyThread extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

	public MyThread(String name) {

		super(name);

	}

}

class ThreadNaming {

	public static void main(String[] args) {

		MyThread t = new MyThread("Kumar");
		t.start();

	}

}*/

/* Naming a Thread object by Thread class constructor: Thread(Runnable, String) */

/*class MyRunnable implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName());

	}

}

class ThreadNaming {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();

		Thread t = new Thread(r, "Gautam");

		t.start();

	}

}*/
