


/**

* Program Description: This program is to implement FileReader class of java.io package
* @Author: Vikas

*/

// Java FileReader class is used to read character-oriented data from the file.

import java.io.*;


public class FileReaderTest{

	public static void main(String[] args){
		
		int a =0;

		FileReader fr = null;

		try{

			fr = new FileReader("test.txt");
			
			
			// the read method is present inside Reader class
			
			while((a=fr.read())!=-1){// read() method is to read the file

				System.out.print((char)a);
							
			}			
			
		}

		catch(IOException e){

			e.printStackTrace();
		
		}

		finally{
			
			try{

				// the close() is used to close the stream
							
				fr.close();// the close method is prsent inside Reader class
			}

			catch(IOException e){

				e.printStackTrace();

			}			
			
			

		}				
	
	}


}
