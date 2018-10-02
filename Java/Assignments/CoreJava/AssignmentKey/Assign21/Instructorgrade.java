/*
The certain instructor assigns letter grade for his course based on the following table: 
                    Score       Grade 
                    >= 90       A+ 
                    >= 85       A 
                    >= 80       B+ 
                    >= 75       B 
                    >= 65       C+ 
                    >= 60       C 
                    >= 55       D+ 
                    >= 50       D 
                    < 50        F 
Write a class, Grader, which has:  an instance variable, score, an appropriate constructor and appropriate methods a method, letterGrade() that returns the letter grade as a String. Now write a demo class to test the Grader class by reading a score from the user,  using it to create a Grader object after validating that the value is not negative and  is not greater then 100. Finally, call the letterGrade() method to get and print the  grade.*/

import java.io.*;
import java.util.Scanner;

class Grader
{
	int score;
	Grader(int score)
	{
		this.score=score;
		
	}
	String letterGrade()
	{
		 if (score>=90)
		 {
			 return("A+");
		 }
		 else if (score>=85 &&score<90)
		 {
			 return("A");
		 }
		 else if (score>=80 &&score<85)
		 {
			 return("B+");
		 }
		 else if (score>=75 &&score<80)
		  {	 
			return("B");
		  }
		 else if (score>=65 &&score<75)
		  {
			 return("C+");
		  }
		 else if (score>=60 &&score<65)
		  {
			 return("C");
		  }
		 else if (score>=55 &&score<60)
		  {
			 return("D+");
		  }
		 else if (score>=50 &&score<55)
		  {
			 return("D");
		  }
		 else 
		  {
			 return("F");
		  }
	}
}
public class Instructorgrade 
{
	public static void main(String args[])
	{
		int score;
		String grad;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your score");
		score = sc.nextInt();
		Grader gd = new Grader(score);
		if (score >= 0 && score <= 100)
		{
		 grad = gd.letterGrade();
		 System.out.println("Your grade is: "+ grad);
		}
		else
		{
		 System.out.println("Input cannot be negative or greater than 100");
		}
		
	}
}
