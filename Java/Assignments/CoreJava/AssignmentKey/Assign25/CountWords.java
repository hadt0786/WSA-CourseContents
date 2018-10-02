/*
 * Write a program to read a line of text from keyboard then using StringTokenizer class 
 * print each word of this text in separate line (one word per line) and 
 * at the last print total number of words in the text . 

 */
	import java.io.*;
	import java.util.*;

 public class CountWords
 {
  	public static void main(String[] args) throws IOException
 	{
 	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String lineOfTxt;
 	  StringTokenizer words;
 	  int count = 0;
 	  String str;
 	  System.out.println("enter a line of text");
 	  //Reads the line of text till there is no input
 	  while ((lineOfTxt = br.readLine()) != null)
 	  {
      		// process words in line
	  	words = new StringTokenizer(lineOfTxt);
	  	
		//Counts the words
	  	count=words.countTokens();

	  	//repeats loop till there are no words
	  	while (words.hasMoreTokens())
	  	{
		  str = words.nextToken();   //moves to next word
		  System.out.println(str); //prints each word

	  	} // end of nested while
	 	 System.out.println("\n" + count+ " words read");
 	  } //end of while
 
 	} //end of main
 	
 } //end of class
