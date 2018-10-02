// Example of Interface
// Author :Sandhya
interface A1
{
	final static float val=4.2f;
	abstract void print();
	
}
class TestDisp implements A1
{
	public void print()
	{
		
		System.out.println("Value"+val);
	}
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TestDisp d1 =new TestDisp();
    d1.print();
	}

}
