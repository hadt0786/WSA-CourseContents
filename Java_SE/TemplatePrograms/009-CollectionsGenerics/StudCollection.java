import java.util.*;
// Example of adding class object in arraylist 
//Author :Sandhya
class Student5
{
	int id;
	String Name;
	int age;
	Student5(int id,String Name,int age)
	{
		this.id=id;
		this.Name=Name;
		this.age=age;
		}
	}


public class StudCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student5 s1=new Student5(10,"B",22);
		Student5 s2=new Student5(11,"A",21);
		Student5 s3=new Student5(12,"C",24);
		
		ArrayList<Student5>  a1= new ArrayList<Student5>();//creating arraylist
		a1.add(s1);//adding Student5 class object
		a1.add(s2);
		a1.add(s3);
		
		Iterator itr =a1.iterator();
		
		// traversing element of ArrayListObject
		while(itr.hasNext())
		{
			Student5 st = (Student5)itr.next();
			System.out.println(st.id+ "  "+ st.Name+ "  "+st.age);
		}
		
		
	}

}
