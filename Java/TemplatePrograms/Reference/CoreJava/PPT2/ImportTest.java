
/**


* Author: Vikas
* Program Description: The code is to show you the implementaion of "import" keyword

*/

import java.util.*;// asterix represents all the java class file inside the package.

// or

//import java.util.Date; // here there is no asterix, here we are trying to access the specific java class


class PrintDate{


	public void printDate(){

		
		Date d = new Date();
		
		System.out.println(d);
	}


}

public class ImportTest{



	public static void main(String[] args){

		PrintDate d = new PrintDate();
		d.printDate();
		

	}

}
