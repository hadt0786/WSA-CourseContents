

/**


* Program Description: This program is show how enhanced for loop works in java
* @Author: Vikas


*/




import java.util.*;

class Student{

	String name;
	
	Student(String name){

		this.name= name;
	}

	public String getName(){

		return name;

	}



}
public class EnhancedForLoopTest1{


	public static void main(String[] args){

	ArrayList<Student> al = new ArrayList<Student>();
	
	al.add(new Student("Peter"));
	al.add(new Student("Robert"));
	al.add(new Student("Lee"));
	al.add(new Student("Daniel"));
	al.add(new Student("Brown"));

	//Using the Iterator interface with traditioal for loop
	
	for ( Iterator<Student> i = al.iterator() ; i.hasNext() ; )
	{
		Student s = (Student)i.next();

		System.out.println(s.getName());
		
	}
		

	}


}
