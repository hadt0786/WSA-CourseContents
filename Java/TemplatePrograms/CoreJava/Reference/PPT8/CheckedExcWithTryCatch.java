


/**


* Author: Vikas
* Program Description: This program is show the implementation of checked exception with try and catch block

*/

import java.io.*;
import java.sql.*;

/*if programmer give the try and catch block then the compiler doesn't show any error*/


public class CheckedExcWithTryCatch{



	public static void main(String[] args){

		try{
		
		throw new IOException();
		//throw new SQLException();


		}

		catch(IOException ie){

			System.out.println(ie);
		}

		/*catch(SQLException se){

			System.out.println(se);
		}*/
		
	}


}
