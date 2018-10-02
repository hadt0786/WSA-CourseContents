/*
 * Write a program that reads in three strings and sorts them lexicographically.
Enter strings:
Charlie Able Banker
Output:
Able Banker Charlie

 * Sorting the words in Dictionary order is lexicographically
 */
import java.util.*;
public class Stringlexicograph
{
	public static void main(String[] args) 
	{

	  Scanner sc = new Scanner(System.in);
	  String str1,str2,str3;
 	  System.out.println("Enter Strings: ");

	 	str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();


		String first = str1;
		String last = str1;
		if( first.compareTo(str2) > 0) 
		{ 
		 first = str2; 
		} 
		if( first.compareTo(str3) > 0) 
		{ 
		 first = str3; 
		} 
		if( last.compareTo(str2) < 0) 
		{ 
		 last = str2; 
		} 
		if( last.compareTo(str3) < 0) 
		{ 
		 last = str3; 
		}   
		 String middle;
		if( !str1.equals(last) && !str1.equals(first) )
		{
  		  middle = str1; 
		} 
		else if( !str2.equals(last) && !str2.equals(first) )
		{
    		 middle = str2; 
		} 
		else
		{
    		 middle = str3; 
		} 

		System.out.print( first +"\t"); 
		System.out.print( middle +"\t"); 
		System.out.print( last ); 


	}
}
