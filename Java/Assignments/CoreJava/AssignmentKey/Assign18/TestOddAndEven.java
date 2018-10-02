/*
 *  Write Java program involving two classes: OddAndEven and TestOddAndEven. 
OddAndEven has the following: 
instance varaibales countOfOdd and countOfEven both of type int 
A method addNumber that takes a number as parameter and increment 
  countOfOdd, if the number is odd, else increment countOfEven. 
A method toString that returns a string in the form: “Number of Odd: x    Number of Even : y”, where x and y are the values of the instance     variables. 
The TestOddAndEven class first creates OddAndEven object, then in a loop, read a number and use it to call the addNumber method until the user enters Q. Finally, it prints the count of odd and even numbers entered. 
 */
import java.util.*;
 class OddAndEven
{
	static int countOfOdd, countOfEven,digit;

	void addNumber(int num)
	{
		digit = num;
		if (num%2 == 0)
		{
		  countOfEven++;
		}
		else
		{
		  countOfOdd++;
		}
	}
	public String toString()
	{
		
		return ("Number of Odd : "+countOfOdd+"\tNumber of Even :"+countOfEven);
		
	}
}
	public class TestOddAndEven
	{
	   public static void main(String[] args) 
	    {
		String n;
		int number;
		Scanner sc = new Scanner(System.in);
		OddAndEven ode = new OddAndEven();
		 do
		 {
	             System.out.print("Enter a number or Q to stop: ");
	             n = sc.next();
                     if (!n.equalsIgnoreCase("q"))
		    {
                       number = Integer.parseInt(n);
		       ode.addNumber(number);
             	    }

                 } while (!n.equalsIgnoreCase("q"));
		
		  String str = ode.toString();
		  System.out.println(str);
	
            }

        }
