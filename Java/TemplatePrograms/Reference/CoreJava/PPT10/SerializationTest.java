

/**

* Program Description: This program is to implement serialization and De-serialization
* @Author: Vikas


*/

import java.io.*;

class Student implements Serializable{

	
	String name;
	
	Student(String name){

		this.name = name;
		
	}


	public String getName(){

		return name;

	}

}

//------------------------------Writing a class to serialize the Student object

public class SerializationTest{


	public static void main(String[] args){

		try{

			FileOutputStream fos = new FileOutputStream("test.txt");// Serializing the Student object on test.txt file
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Student s = new Student("My Name is Khan");			
			
			oos.writeObject(s);// writeObject() method is to write the object on the file	

		}


		catch(Exception e){

			e.printStackTrace();// will print the stack trace when exception is occured

		}

		finally{

			System.out.println("The object is serialised...");// finally block is always executed whether exception occurs or not

		}		

	}

}


//----------------------------------------Writing a class to de-serialize the Student object


class DeSerializationTest{


	public static void main(String[] args){

		try{

			FileInputStream fis = new FileInputStream("test.txt");// Serializing the Student object on test.txt file
			
			ObjectInputStream oos = new ObjectInputStream(fis);			
			
			Student s = (Student)oos.readObject();// readObject() method is to read the object from the file
		
			System.out.println(s.getName());	

		}


		catch(Exception e){

			e.printStackTrace();// will print the stack trace when exception is occured

		}

		finally{

			System.out.println("The object is de-serialised...");// finally block is always executed whether exception occurs or not

		}		

	}

}

