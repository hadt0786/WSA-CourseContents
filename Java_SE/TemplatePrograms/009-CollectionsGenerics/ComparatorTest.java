package com.emertxe;

/**
 * Program Description: This program is to implement the ordering of collection object by Coparator interface
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: java ComaparatorTest.java
 * Execution: java CompaparatorTest
 * Output:
 */

import java.util.*;

class Student {

	String firstName, lastName;
	int studentID = 0;
	double GPA = 0.0;

	public Student(String firstName, String lastName, int studentID, double GPA) {

		if (firstName == null || lastName == null || studentID == 0
				|| GPA == 0.0)
			throw new NullPointerException();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = GPA;

	}

	public String firstName() {

		return firstName;
	}

	public String lastName() {

		return lastName;
	}

	public int studentID() {

		return studentID;
	}

	public double GPA() {

		return GPA;
	}
}

class NameComp implements Comparator {

	public int compare(Object o1, Object o2) {
		return (((Student) o1).firstName.compareTo(((Student) o2).firstName));
	}
}

class GradeComp implements Comparator {

	public int compare(Object o1, Object o2) {

		if (((Student) o1).GPA == ((Student) o2).GPA)
			return 0;
		else if (((Student) o1).GPA < ((Student) o2).GPA)
			return -1;
		else
			return 1;
	}
}

public class ComparatorTest {

	public static void main(String[] args) {

		Comparator c = new NameComp();
		TreeSet studentSet = new TreeSet(c);
		studentSet.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student("John", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));
		Object[] studentArray = studentSet.toArray();
		Student s;
		for (Object obj : studentArray) {
			s = (Student) obj;

			/* Using printf method of Java */

			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n",
					s.firstName(), s.lastName(), s.studentID(), s.GPA());

		}

	}
}
