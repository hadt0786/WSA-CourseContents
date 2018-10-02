/**

* Author: Vikas
* Program Detail: This code to show how jvm executes the program when all class members are static 
* Referece: "Java Virtual Machine Delving Deep into its Architecture" Article published in OSFY in December 2014 at page 55

*/

/*All static members of a class are identified and executed in the same order in which they appear. when all the static members are executed, only then the main function is executed */


class JVMInternalExamp1{

	static int a =m1();

	static{

		System.out.println("in satic block");

	}

	public static int m1(){

		System.out.println("in m1");

		return 10;
	
	}


	public static void main(String[] args){
		
		System.out.println("in main");	
		
	}

}
