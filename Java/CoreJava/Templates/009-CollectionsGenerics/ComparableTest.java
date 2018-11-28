package com.emertxe;

import java.util.*;

/**
 * Program Description: this program is to show how we can order the collection
 * objects with the help of Comparable interface
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac ComparableTest.java 
 * Execution: java ComparableTest 
 * Output:
 */

// TreeSet class is present inside the java.util package

class Student implements Comparable {

	String firstName, lastName;
	int studentID = 0;
	double GPA = 0.0;

	public Student(String firstName, String lastName, int studentID, double GPA) {

		if (firstName == null || lastName == null || studentID == 0
				|| GPA == 0.0) {

			throw new IllegalArgumentException();

		}

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

	public int compareTo(Object o) {

		double f = GPA - ((Student) o).GPA;
		if (f == 0.0)
			return 0;
		else if (f < 0.0)
			return -1;
		else
			return 1;
	}
}

public class ComparableTest {

	public static void main(String[] args) {

		TreeSet studentSet = new TreeSet();

		studentSet.add(new Student("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student("John", "Lynn", 102, 2.8));
		studentSet.add(new Student("Jim", "Max", 103, 3.6));
		studentSet.add(new Student("Kelly", "Grant", 104, 2.3));

		Object[] studentArray = studentSet.toArray();
		Student s;

		for (Object obj : studentArray) {

			s = (Student) obj;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n",
					s.firstName(), s.lastName(), s.studentID(), s.GPA());

		}

	}

}
