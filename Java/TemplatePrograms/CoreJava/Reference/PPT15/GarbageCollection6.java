

/**

* Program Description: This program is too show how JVM takes the request to perform garbage collection
* @Author: Vikas
* Referece: "Performing Garabge Collection in Java" Article published in OSFY in January 2015 at page 68

*/



class Test{

	
	// finalize() method is used to perform finalization, it is called just before the object colleted as garbage


	public void finalize(){


		System.out.println("Garbage collection is performed");
		
		

	}
	
	public static void main(String[] args){

		Test t = new Test();
		
		t = null;
		
		/* the method to request JVM to run garbage collection is callled the gc() method. It is used to give the call to the garbage 			collector explicitly. The call to the garbage collector by the gc() method doesn't mean that the garbage collector is ready to 			perform garbage collection. The gc() method is present inside java.lang.System class and java.lang.Runtime class*/

		System.gc(); 

	}

}
