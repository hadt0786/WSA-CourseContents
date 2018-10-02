 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sample {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter value of x");

		int x=Integer.parseInt(br.readLine());
			System.out.println("value of x"+x);

	}
	
	
}
