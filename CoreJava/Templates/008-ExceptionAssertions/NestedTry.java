//nested try block Example
//Author :Sandhya
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try//outer try
		{
			try//inner try
			{
		       int s=6/0;
		       System.out.println("s="+s);
			}
			catch(ArithmeticException e1)
			{
			System.out.println("divide error");
				
			}
			try//inner try
			{
				int a[]=new int[5];
				a[4]=8;
				System.out.println("value is"+a[4]);
		}
			catch(ArrayIndexOutOfBoundsException e3)
			{
				System.out.println("out of array bound");
				
			}
		}
		
		
		catch(Exception e)//outer catch
		{
			System.out.println("handled");
		} 
		finally
		{
			System.out.println("End of Program");
		}
		
}

}
