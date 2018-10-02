package hello;

 
class student
{
	int rno;
	void getNum(int n)
	{
		rno=n;
	}
	void putNum()
	{
		System.out.println("Rollno:"+rno);
	}
}
class Test extends student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
		part1=m1;
		part2=m2;
		
	}
	void putMarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("part1="+part1);
		System.out.println("part2="+part2);
		
	}
}
interface Sports
{
	float sportwt=6.05f;
	void putwt();
}
class Results extends Test implements Sports
{
	float total;
	public void putwt()
	{
		System.out.println("sports wt="+sportwt);
			}
void display()
{
	total=part1+part2+sportwt;
	putNum();
	putMarks();
	putwt();
	System.out.println("total Score="+total);
	}
}
public class InterfMultipl {
public static void main(String args[])
{
	Results stu1=new Results();
	stu1.getNum(12);
	stu1.getMarks(85f, 80f);
	stu1.display();
}
}
