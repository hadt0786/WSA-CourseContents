package hello; 
interface Area
{
	final static float pi=3.14f;
	float compute(float x, float y);
}
class rectg implements Area
{

	public float compute(float x, float y) {
		
		return x*y;
	}
	}
class cir implements Area
{
	public float compute(float x, float y)
	{
		return (pi*x*x);
	}
}

public class InterfaceTest {

	public static void main(String args[])
	{
		rectg rec=new rectg();
		cir c=new cir();
	Area area;
	area=rec;
	System.out.println("Area of rectangle"+area.compute(12,3));
	area=c;
	System.out.println("Area of circle is"+area.compute(2,3));
		
	}
}

