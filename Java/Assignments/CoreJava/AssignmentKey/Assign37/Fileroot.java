/*
 * Write a program to read a,b,c from data file and 
 * store roots of the quadratic equation in
output file. You must open your output file in append mode.

 */

import java.io.*;

public class Fileroot
 {
	static int a,b,c;
	public static void main(String args[])throws IOException
	{
		String ln; // reads a line from file 
	
		// Opening input File "abc.txt" 

		 BufferedReader ab = new BufferedReader(new FileReader("/home/likhitha/Desktop/abc"));
		 
		//Opening output File "roots.txt" 
		 PrintWriter lt = new PrintWriter(new FileWriter("/home/likhitha/Desktop/roots.txt"));
			 
		 ln = ab.readLine(); // Reads the first line of the File  
					
			a=Integer.parseInt(ln); //converting to integer 
			ln = ab.readLine();
			 b=Integer.parseInt(ln);
			ln = ab.readLine();
			 c=Integer.parseInt(ln);
			 
		 
		 double temp1 =b * b - 4 * a * c;
		 double root1 = (-b +  temp1) / (2*a) ;
	         double root2 = (-b -  temp1) / (2*a) ;
	         System.out.println(root1);
	         System.out.println(root2);
	    //   String r1=root1.toString();
	   //    lt.append(root1);
	         lt.println(root1);
	         lt.println(root2);
	}

}
