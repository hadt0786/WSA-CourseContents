

/**


* Author: Vikas
* Program Description: This program is to show how we implement try catch and finally together


*/

/*try block will either be followed by catch or finally or both catch and finally*/

/*there can't be a catch or finally block without try block*/

/*if try, catch and finaaly are there then the order must be try, catch and finally block*/

/* programmers are not suppose to write any statement between try, catch and finally*/



public class TryCatchFinally{


	public static void main(String[] args){


		try{


			int r = 8/0;

			System.out.println(r);

			System.out.println("in side try");

		}

		catch(Exception e){

			System.out.println(e);
		}

		finally{

			System.out.println("Finally block will always execute");

		}

	}


}
