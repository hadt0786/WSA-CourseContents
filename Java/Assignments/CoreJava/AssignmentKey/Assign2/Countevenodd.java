//Write a java program to prints the count of odd and even no’s entered.
import java.util.*;

public class Countevenodd
 {
	 public static void main(String[] args)
	 {
		 Scanner sc= new Scanner(System.in);
		 int x[]=new int[15],i=0 ;
		 int oddcount=0,evencount=0;
		 System.out.println("Enter integer or press 0 to terminate: ");
     		
		for ( i = 0; i < 14; i++)
       		 {
    	  		x[i] = sc.nextInt(); //Reads the number
		
			//if the number is zero it stops reading the number and terminates
        		if (x[i] == 0)     
			{				
        		  break;
    			}
			//if number is even it increases the even count
        		else if (x[i]%2 == 0)
		  	{
            	          evencount++;
 			}
			//if number is odd it increases the odd count
                 	else
		  	{
	        	  oddcount++;
		  	}	
            	
	         }
	            
	  	   System.out.println("count of even numbers="+evencount);
	   	   System.out.println("count of odd numbers="+oddcount);
	   
         }
 }
