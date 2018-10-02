package com.emertxe;

public class Student 
{
int rollno;
String name;
int age;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void studentDetail()
{
	System.out.println("\nrollno="+rollno+"\nname="+name+"\nage="+age);
}
}
