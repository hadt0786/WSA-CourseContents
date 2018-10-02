package com.emertxe;

import java.io.*;

/**
 * Program Description: This program is to implement serialization and
 * De-serialization
 * 
 * Author: Vikas 
 * Written: 09/02/2015 
 * Last Update:
 * 
 * Compilation: javac SerializationTest.java 
 * Execution: java SerializationTest
 * Output:
 */

class Student implements Serializable {

	String name;

	Student(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

}

// Writing a class to serialize the Student object

public class SerializationTest {

	public static void main(String[] args) {

		try {

			// serializing the Student object on test.txt file

			FileOutputStream fos = new FileOutputStream("test.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Student s = new Student("My Name is Khan");

			// writeObject() method is used to write the object on the file

			oos.writeObject(s);

		}

		catch (Exception e) {

			// will print the stack trace when exception is occurred

			e.printStackTrace();

		}

		finally {

			// finally block is always executed whether exception occurs or not
			System.out.println("The object is serialised...");

		}

	}

}

// Writing a class to de-serialize the
// Student object

class DeSerializationTest {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("test.txt");

			ObjectInputStream oos = new ObjectInputStream(fis);

			Student s = (Student) oos.readObject();

			System.out.println(s.getName());

		}

		catch (Exception e) {

			e.printStackTrace();

		}

		finally {

			System.out.println("The object is de-serialised...");

		}

	}

}
