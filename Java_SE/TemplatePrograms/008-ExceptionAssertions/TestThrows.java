import java.io.*;
//throws and throw example
//Author :Sandhya
class TestThrow
{
	 void MethodA(int a ) throws ArithmeticException
	{
		if(a>5)
		{
		throw new ArithmeticException("value more than 5");
		//System.out.println("value more than 5");
		}
	}
	
}
public class TestThrows {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try
	{
		TestThrow t1=new TestThrow();
	       t1.MethodA(6);
	}
      
    catch(ArithmeticException e)
	{
    	System.out.println("value more than 5");
	}
 	}

}
