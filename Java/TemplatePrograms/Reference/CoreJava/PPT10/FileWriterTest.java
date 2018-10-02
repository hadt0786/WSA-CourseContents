


/**


* Program Description: This program is to implement FileWriter class of java.io package
* @Author: Vikas

*/

//Java FileWriter class is used to write character-oriented data to the file.

import java.io.*;

public class FileWriterTest{


	public static void main(String[] args){

		FileWriter fw = null;
		
		try{

			fw = new FileWriter("test.txt");
			
			// write method is used to write the content on the file

			fw.write("My Name is Khan");// write is present inside Writer class of java.io package 

			
		}

		catch(IOException e){

			e.printStackTrace();

		}
	
		finally{

			try{

				fw.close();
			}

			catch(Exception e){

				e.printStackTrace();

			}			
			
			System.out.println("Success");

		}

	}


}


