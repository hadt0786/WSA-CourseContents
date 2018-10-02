

/**


* Author: Vikas
* Program Description: This program is to show the uses of thows and try, catch and finally by understanding handle and declare rule


*/

/*The handle and declare rule say that if you are handling the exception by try, catch and finaaly then declare it by throws keyword, the handle and declare rule is applicable only to checked exception */

import java.io.*;

public class HandleAndDeclare{


	public static void main(String[] args) throws IOException{

		throw new IOException();// checked exception

	}


}
