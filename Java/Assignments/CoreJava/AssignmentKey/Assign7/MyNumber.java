/*Write a java program 'MyNumber.java" that performs following operations on a variable 'num' of type double:
a) Finds the round value of 'num' and stores the result in a variable numRound of type double.
b) Finds the ceil value of 'num' and stores the result in a variable numCeil of type double.
c) Finds the floor value of 'num' and stores the result in a variable numFloor of type double
d) Cast 'num' to type int and stores the result in a variable numInteger of type int
*/
import java.util.*;
import java.io.*;
public class MyNumber
{
	public static void main(String args[ ])
	 {
	  double num;
	  double numRound, numCeil, numFloor;
	  int numInteger;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of num");
		num = sc.nextDouble(); //Reads the number
			
		numRound = Math.round(num);
		System.out.println("Round value of  "+num+ "is : " + numRound );

		numCeil = Math.ceil(num);
		System.out.println("Ceil value of  "+num+ "is : " + numCeil);

		numFloor = Math.floor(num);
		System.out.println("Floor value of  "+num+ "is : " + numFloor);

		numInteger = (int)num;
		System.out.println("Cast "+ num + " to type int : " + numInteger);
	 }
}
