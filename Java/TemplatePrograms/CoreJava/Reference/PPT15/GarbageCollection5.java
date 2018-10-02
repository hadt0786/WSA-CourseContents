

/**



* Program Description: This is is show how garbage collection is performed in java
* @Author: Vikas
* Referece: "Performing Garabge Collection in Java" Article published in OSFY in January 2015 at page 68

*/

// Illustration: 4- Island of isolation

// Draw the diagram to explain this program


 class Test{

	Test i;

	public static void main(String[] args){

		
		// creating three objects

		Test t1 = new Test();

		Test t2 = new Test();

		Test t3 = new Test();


		// Assiging the reference of all the three objects to each object's instance variable
		
		t1.i = t2;
		t2.i = t3;
		t3.i = t1;

		// Assigning null to the reference variable 

		t1 = null;// no object eligible for garbage collection

		t2 = null;// no object eligible for garbage collection

		t3 = null; // all three objects are now eligible for garbage collection

		


	}


}
