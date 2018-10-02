/*
 Write a program to create a sequential file that could store details about five products.
Details include product code, cost, and number of items available and are provided
through the keyboard.
 */
import java.io.*;
import java.util.*;
class Product {
	static DataInputStream din=new DataInputStream(System.in);
	static StringTokenizer st;
	public static void main (String args[])throws IOException
	{
	
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("product.txt"));
	//Reading data from keyboard
	System.out.println("enter 5 products code,cost,and number of items available");

	for(int i=1;i<=5;i++)
	{
		System.out.println("enter the product code");
		st=new StringTokenizer(din.readLine());
		int pcode=Integer.parseInt(st.nextToken());
		

		System.out.println("enter the product cost");
		st=new StringTokenizer(din.readLine());
		double cost=new Double(st.nextToken()).doubleValue();
		

		System.out.println("enter the number of items available");
		st=new StringTokenizer(din.readLine());
		int pitems=Integer.parseInt(st.nextToken());
		
		//writing to the file product.txt
		dos.writeInt(pcode);
		dos.writeDouble(cost);
		dos.writeInt(pitems);
	
		
	}
	
	}

}
