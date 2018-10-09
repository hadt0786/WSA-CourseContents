

/**

* Author: Vikas
* Program Description: the program is to show the implementation of equals() method and == operator


*/



public class EqualsTest{



	public static void main(String[] args){


		// testing the relational operator (==) 

		// the "==" checks whether the value of two operands are equal or not

		int a =10;
		int b= 10;

		if(a==b){


			System.out.println("== Test: A and B are equal");

		}



		// testing equals() method
		
		/*equals() method compares string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object. */
	
		String Str1 = new String("Hello");
		
      		String Str2 = Str1;
      		
		String Str3 = new String("Hello");
      
		boolean retVal;

      		retVal = Str1.equals( Str2 );
      
		System.out.println("Returned Value = " + retVal );

      		retVal = Str1.equals( Str3 );
      
		System.out.println("Returned Value = " + retVal );
	}


}
