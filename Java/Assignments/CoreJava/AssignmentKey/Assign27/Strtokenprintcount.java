/*
 * 27.Write a program in Java that reads in text and prints as output the following: 
The number of words in the text 
The number of sentences in the text 
The number of times the letter “e” occurs in the text 
The number of times the letter “z” occurs in the text 
( Note: Use StringTokenizer class ) 
 */
import java.io.*;
import java.util.StringTokenizer;
public class Strtokenprintcount
{
	public static void main(String[] args) throws IOException
	{
	  int cntwrd, cntSent, cntE, cntZ;
	  String txt;
	  System.out.println("Please enter text:");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  txt = br.readLine().toLowerCase();
	  StringTokenizer sent = new StringTokenizer(txt, ".");
	  StringTokenizer words = new StringTokenizer(txt, ". \t");
	  cntSent = sent.countTokens();
	  cntwrd = words.countTokens();
	  cntE = 0;
	  cntZ = 0;
	  int i = 0;
	   while (i < txt.length())
	    {
		if (txt.substring(i, i+1).equals("e"))
		{
		  cntE++;
		}
		if (txt.substring(i, i+1).equals("z")) cntZ++;
		{
		  i++;
		}
	    }
		System.out.println();
		System.out.println("The Number Of Words is :" +cntwrd );
		System.out.println("The Number Of Sentences is :"+cntSent );

		System.out.println("The Number Of Time E Occurs:"+cntE );
		System.out.println("The Number Of Time Z Occurs:"+cntZ );
	}
}


