

/**


* Program Description: This program is to show how Buffered Streams class BufferedReader is implemented 
* @Author: Vikas


*/

// Implementing BufferedReader class


import java.io.*;


public class BufferedReaderTest{


	public static void main(String[] args){

		FileReader fr = null;
		BufferedReader br = null;

		
		try{

			fr = new FileReader("test.txt");
			
			br = new BufferedReader(fr);

			int a =0;

			while((a=br.read())!=-1){


				System.out.print((char)a);

			}
			

		}


		catch(IOException e){

			e.printStackTrace();

		}

		finally{

			try{
		
			//br.flush();// flush before closing the connection
			br.close();			
			fr.close();			
			

			}	
				
			catch(IOException e){

				e.printStackTrace();
			
			}		
			
			

		}

	}


}
