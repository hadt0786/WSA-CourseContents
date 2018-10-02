package com.emertxe;

/**
 * Program description: this program is to show how we traverse the collection object using Iterator interface
 * 
 * Author: Vikas
 * Written: 09/02/2015
 * Last Update: 
 * 
 * Compilation: javac IteratorTest.java
 * Execution: java IteratorTest
 * Output: 
 */

import java.util.*;

class Student {

	String name;

	Student(String name) {

		this.name = name;

	}

	public String getName() {

		return name;
	}

}

public class IteratorTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Kim"));
		list.add(new Student("Jiin"));
		list.add(new Student("Yong"));
		list.add(new Student("Park"));
		list.add(new Student("Lee"));

		Iterator<Student> elements = list.iterator();

		while (elements.hasNext()) {

			Student s = (Student) elements.next();
			System.out.println(s.getName());

		}

	}

}
