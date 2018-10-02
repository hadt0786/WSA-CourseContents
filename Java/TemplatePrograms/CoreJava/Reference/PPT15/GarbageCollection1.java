

/**
* Author: Vikas
* Program Detail: the code is to show the how garbage collection is performed in Java
* Referece: "Performing Garabge Collection in Java" Article published in OSFY in January 2015 at page 68

*/




class Student{

	public static void main(String[] args){

		// Illustration: 1-performing garbage collection in java using nullifying the reference variables
		
		/*


		* in the code below, we can see two objects of Student(s1, s2).
		* when we create a second object of the same, it is obvious that you don't need the first object
		* in that case, it is highly recommended that the previous object is made eligilbe for garbage collection
		* so we use "s1=null" to make the previous object eligible for garbae collection 

		*/
	
		//Student s1 = new Student();
		
		//Student s2 = new Student();
		
		//s1 = null;// one object eligible for garbage collection


		// Illustration: 2- performing garbage collection in java using re-assigning the reference variables
		
		
		Student s1 = new Student();// first object
		
		Student s2 = new Student();// second object

		// creating third object

		s1 = new Student(); // first object becomes eligible for garbage collection
		
		s2 = s1;// second object becomes eligible for garbage collection

		
		

}


}
