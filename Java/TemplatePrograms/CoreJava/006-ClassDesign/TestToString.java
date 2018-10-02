/*Example of toString()-
* method returns the string representation of the object
 Author :Sandhya */
class Student3
{
	String Name;
	int marks;
	Student3(String Name,int marks)
	{
		this.Name=Name;
		this.marks=marks;
	}
	public String toString()
	{
		
		return Name +  "  " +marks;
	}
}

public class TestTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 s1=new Student3("abc",78);
		Student3 s2=new Student3("xyz",80);
		System.out.println(s1);
		System.out.println(s2);
	}

}
