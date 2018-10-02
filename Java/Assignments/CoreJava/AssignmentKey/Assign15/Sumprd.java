//Write a Java Program which prompts the user to enter 4 numbers. The program will then  computes and display their sum and their product. 
 import java.util.Scanner; // import Scanner  
       
    public class Sumprd  
     {  
       public static void main(String args[])  
        {  
       	  Scanner input = new Scanner(System.in);  
       
	    int num1, num2, num3, num4; // first integer  

	    System.out.print("Enter four integer: ");  
	    num1 = input.nextInt();  
	    num2 = input.nextInt();  
	    num3 = input.nextInt();  
 	    num4 = input.nextInt(); 
    
	    System.out.println("sum of 4 numbers"+(num1+num2+num3+num4));

 	    System.out.println("Product of 4 numbers"+(num1*num2*num3*num4));
    
        }
     }
