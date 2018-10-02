/*
A sales person is paid commission based on the sales he makes as shown by the  following table: 
           SALES       				COMMISSION 
          Under  SR500    			  2 % of SALES 
          SR500  and under SR5000    		  5 % of SALES 
          SR5000  and over     		  	  8 % of SALES 
          Write a class, Commission, which has: an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission. Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. Finally, call the commission() method to get and print the commission. If the sales are negative, your demo should print the message “Invalid Input”. 
*/
import java.util.*;
class Commission
{
	double sales;
	Commission(double sales)
	{
	 this.sales=sales;
	 if(sales>=5000)
	 {
	  System.out.println("The Commission is "+( (8*sales)/100));
	 }
	 else if(sales>=500 &&sales<5000)
	 {
	   System.out.println("The Commission is "+( (5*sales)/100));
	 }
	 else if(sales<500 &&sales >=0)
	 {
 	  System.out.println("The Commission is "+( (2*sales)/100));
	 }
	else
	{
	 System.out.println("Invalid input");
	}
	
        }
}
public class DemoSales
{
	public static void main(String args[])
	{
	  double sales;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sales");
	  sales=sc.nextDouble();
	  Commission cs= new Commission(sales);
	}
}

