


/**

* Program Description: this code is to show the implementation of sleep() method of Thread class
* @Author: Vikas

*/

/*


sleep() method based on our requirement we can make a thread to be in sleeping state for a specified period of time

*/

/*class MyThread extends Thread{



	public void run(){


		for(int i=1; i<=10;i++){

			System.out.println(5*i);
			
			try{

				sleep(1000);// sleep() method is present inside Thread class
			}

			catch(InterruptedException e){// sleep() method throws InterruptedException

				e.printStackTrace();
	
			}

		}

	}

}

public class SleepMethodTest{



	public static void main(String[] args){


		MyThread t = new MyThread();
		t.start();

	}

}*/


//------------------------------------------------------------------testing the sleep() method in multiple threads

/*

	this program is to show the implementation of sleep() method when two threads executing.
	
	when one thread goes to sleep, other thread is executed

*/

class MyThread extends Thread{



	public void run(){


		for(int i=1; i<=10;i++){

			System.out.println(5*i);
			
			try{

				sleep(1000);// sleep() method is present inside Thread class
			}

			catch(InterruptedException e){// sleep() method throws InterruptedException

				e.printStackTrace();
	
			}

		}

	}

}

public class SleepMethodTest{



	public static void main(String[] args){

		// creating two object of the thread class 

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();

	}

}


