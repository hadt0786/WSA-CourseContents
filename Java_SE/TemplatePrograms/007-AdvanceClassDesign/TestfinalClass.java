javac// Example of Final Class
// Author :Sandhya
 class A2
{
		// final keyword can't let you override the function-- only solution you change function name
	final void disp()
	{
		System.out.print("Hello");
	}
}

class B extends A2
{
	void disp()
	{
		System.out.print("world");
	}
	
}
public class TestfinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1=new B();
		b1.disp();
		
	}

}
