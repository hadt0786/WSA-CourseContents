package com.emertxe;

public class Employee 
{
   String name;
   int age;
   String department;

public Employee(String name, int age, String department) {

	this.name = name;
	this.age = age;
	this.department = department;
}

public void employeeDetail()
{
	System.out.println("\nname="+name+"\nage="+age+"\ndepartment="+department);
}
   
}
