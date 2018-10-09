// Example of abstract class
// Author :Sandhya

abstract class car7
{
	 void disp()
	 {
		 System.out.println("hello");
	 }
	
	}
class Alto extends car7
{
	 void disp()
	 {
		 System.out.print("running safely");
	 }
}



public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       car7 a1=new Alto();
       
       a1.disp();
       
	}

}
