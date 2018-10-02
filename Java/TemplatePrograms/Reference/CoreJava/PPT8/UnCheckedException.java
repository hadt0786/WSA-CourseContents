

/**

* Author: Vikas
* Program Description: This program is show the example of checked and un-checked exception

*/

/*checked exception*/

/*checked exception: not checked by the compiler even if try catch block is not there*/

class UnCheckedException{

	public static void main(String args[]) {
		
		int sum = 0;

		for ( String arg : args ) {
			
			sum += Integer.parseInt(arg);
		}
		
		System.out.println("Sum = " + sum);
	}
}



