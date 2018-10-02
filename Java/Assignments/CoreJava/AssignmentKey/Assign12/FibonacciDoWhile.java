/*
Write a program in the sequence 1 1 2 3 5 8 13 21 ………………  and called Fibonacci numbers. Write a program using a do…while loop to calculate and  print the first m Fabonacci numbers.
*/

import java.util.Scanner;

public class FibonacciDoWhile
 {
	public static void main(String args[])
	 {
	   Scanner sc= new Scanner(System.in);
	   int range;
	   System.out.println("enter the value of range to display fibonacci numbers ");
	   range=sc.nextInt();
  	   int num1 = 0;
 	   int  num2 = 1;
	   int temp = 0;
	   System.out.print(num2+"\t");
	    do
	    {
		temp = num1 + num2;
		System.out.print(temp+"\t");
		num1 = num2;      
		num2 = temp; 
	    } while (num2 < range);
	 }
 }
