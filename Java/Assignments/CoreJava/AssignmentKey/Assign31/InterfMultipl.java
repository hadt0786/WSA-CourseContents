//Write a program where interface can be used to support multiple inheritances. Develop a  standalone Java program for the example. 
 
class students
{
	int rno;
	void set(int n)
	{
		rno=n;
	}
	void put()
	{
		System.out.println("Rollno:"+rno);
	}
}
class TestInterf extends students
{
	float maths,social;
	void getMarks(float m1,float m2)
	{
		maths=m1;
		social=m2;
		
	}
	void putMarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("Maths score="+maths);
		System.out.println("social score="+social);
		
	}
}
interface Sports
{
	float sportscore=6.05f;
	void disp();
}
class Result extends TestInterf implements Sports
{
	float total;
	public void disp()
	{
		System.out.println("sports score="+sportscore);
	}
void display()
{
	total=maths+social+sportscore;
	put();
	putMarks();
	disp();
	System.out.println("total Score="+total);
	}
}
public class InterfMultipl {
public static void main(String args[])
{
	Result stu1=new Result();
	stu1.set(12);
	stu1.getMarks(85f, 80f);
	stu1.display();
}
}
