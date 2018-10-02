

/**


* Program Description: This program is to show how Buffered Streams classes are implemented 
* @Author: Vikas


*/

// Implementing BufferedWriter class


import java.io.*;


public class BufferedWriterTest{


	public static void main(String[] args){

		FileWriter fr = null;
		BufferedWriter br = null;

		
		try{

			fr = new FileWriter("test.txt");
			
			br = new BufferedWriter(fr);

			br.write("Using BufferedWriter class");
			

		}


		catch(IOException e){

			e.printStackTrace();

		}

		finally{

			try{
		
			br.flush();// flush before closing the connection
			br.close();			
			fr.close();			
			

			}	
				
			catch(IOException e){

				e.printStackTrace();
			
			}		
			
			System.out.println("Success...");

		}

	}


}
