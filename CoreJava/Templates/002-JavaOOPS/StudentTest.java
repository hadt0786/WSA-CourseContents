package com.emertxe
/**
 * Program Description: This program to enter name of student and marks of two subjects and Displaying total and average marks 
 * 
 * Author: Sandhya 
 * 
 * Compilation: javac Student.java 
 * Execution: java Student
 * Output:
 * */


import java.util.*;
class Student
{
	String Name;
	int m1,m2;
	float t,av;
	
	void Result(String Nm,int a,int b)
	{
		Name=Nm;
		m1=a;
		m2=b;
		t=m1+m2;
		av=t/2;
		System.out.println("Name"+Name);
                System.out.println("Total marks"+t);
System.out.println("Average marks"+av);
}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String n;
   int x,y;
		Student s1=new Student();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name");
   n=sc.next();
   
   System.out.println("Enter Marks1");
   x=sc.nextInt();
  
   System.out.println("Enter Marks2");
   y=sc.nextInt();
   s1.Result(n, x, y);

	}

}
