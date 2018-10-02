

/**


* Author: Vikas
* Program Description: This program is to show how checked exception works with try, catch and finally

*/



class UnCheckedExByTryCatch{

	public static void main(String args[]) {
		
		
		try{
			
		int sum = 0;

		for ( String arg : args ) {
			
			sum += Integer.parseInt(arg);
		}
		
		System.out.println("Sum = " + sum);

		}

		catch(NumberFormatException nfe){

			//System.err.println("One of the command-line arguments is not an integer.");// prints the customised error message

			//System.out.println(nfe);// prints the Exception class name

			nfe.printStackTrace();// prints the stack trace in checked exception
		}		
		
	}
}
