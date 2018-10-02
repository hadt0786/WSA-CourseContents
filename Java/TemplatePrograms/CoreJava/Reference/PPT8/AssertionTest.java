

/**


* Author: Vikas
* Program Description: This program is to show how and where we use assertion in Java

*/

/*While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError. It is mainly used for testing purpose. */


/* while running the java program user you should enable the assertion*/


import java.util.*;

public class AssertionTest{


	public static void main(String[] args){

		Scanner scanner = new Scanner( System.in );  
  		
		System.out.print("Enter ur age ");  
    
  
		int value = scanner.nextInt();  
  
		assert value>=18:" Not valid";  
  
  		System.out.println("value is "+value);  

	}

}
