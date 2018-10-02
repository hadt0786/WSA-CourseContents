



/**


* Program Description: This program is to show how the garbage collection in java is perofomed 
* @Author: Vikas
* Referece: "Performing Garabge Collection in Java" Article published in OSFY in January 2015 at page 68

*/

// Illustration: 3 - peroforming grabage collection by creating object inside a method

// Example-1

class Student{



}


public class GarbageCollection2{


	

	public static void m1(){

		
		Student s1 = new Student();

		Student s2 = new Student();

	}

	public static void main(String[] args){

	/* the moment m1() method finishes its execution, the local variables s1 and s2 are no longer available. hence there is no reference 		variable at all pointing to either of the two Student objects, in that case the above two Student object becomes eligible for garbage 		collection*/		


		m1();
	

	}


}
