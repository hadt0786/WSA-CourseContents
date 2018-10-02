/*
 * 16. Write a Java program which reads a 4-digit number and
 *  prints the digits on separate lines. (Each digit is printed on one line). 
 */
import java.util.Scanner;
       
    public class Digit  
     {  
         public static void main(String args[])  
   	 {  
  	     Scanner sc = new Scanner(System.in);  
       
 	     int num, temp;
	     System.out.println("Enter four digit number");
 	     num = sc.nextInt();
    
	      while (num!= 0)
 	       {
    	 	 temp = num%10;
   	 	 System.out.println(temp);// numbers are printed in reverse order
  	  	 num = num/10;
   	       }
    
         }
   
     }
    
    
