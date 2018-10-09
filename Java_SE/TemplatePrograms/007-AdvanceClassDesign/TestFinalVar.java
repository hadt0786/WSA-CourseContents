// Example of Final variable
// Author :Sandhya
class car9
{
static final int speed=90;//final variable
   void disp()
   {
	   //speed=400;
	System.out.println(speed); //takes the local variable and prints the 400
	 
	System.out.println(speed);//error can't assign a value to 400 because we are using final keyword and become constant> comment the speed variable

		
   }
}
public class TestFinalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   car9 c1=new car9();
   c1.disp();
		
	}

}
