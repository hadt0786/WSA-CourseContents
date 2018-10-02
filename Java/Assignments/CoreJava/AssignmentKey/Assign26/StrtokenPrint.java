/*
 * Write a program that prompts for and read e-mail address of a user.
 *  The program then prints the user name and the domain name on different lines using StringTokenizer class. 
 */
import java.util.*;
public class StrtokenPrint
{
	public static void main(String[] args)
	{

	 String s = "likhitha@emertxe.com";
	 StringTokenizer st = new StringTokenizer(s,"@");

	 while (st.hasMoreTokens())
	 {
	  String s1 = st.nextToken();
	  System.out.println("your name is : "+s1);
	  String s2 = st.nextToken();
	  System.out.println("your domain name is : "+s2);
	 }
	}
}
