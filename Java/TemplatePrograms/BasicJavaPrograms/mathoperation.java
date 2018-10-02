package hello;

 
//static program
public class Mathoperation {
static float mul(float x, float y)
{
	return x*y;
	}
static float divide(float x, float y)
{
	return x/y;
	
}
public static void main(String args[])
{
	float a=Mathoperation.mul(4.0f,5.2f);
	float b=Mathoperation.divide(4.0f,2.0f);
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}

