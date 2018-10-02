// Example of static variable
// Author :Sandhya
class Student4
{
	String Nm;
	int id;
	static String Univ="SKHU";
	
	Student4(String Nm,int id)
	{
		this.Nm=Nm; 
		this.id=id;
	System.out.println(Nm + "  "+id + "  "+Univ  )	;
	}
	
}
public class Teststatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student4 s1=new Student4("abc",01);
Student4 s2=new Student4("xyz",02);
		
	}

}
