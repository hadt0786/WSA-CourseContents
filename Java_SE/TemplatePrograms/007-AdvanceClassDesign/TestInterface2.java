// Example of multiple Interface
// Author :Sandhya
interface food
{
	void disp();
}

interface Drinks
{
	void disp1();
}
class Restaurants  implements food , Drinks
{
	public void disp()
	{
		System.out.println("Pizza");
		System.out.println("Sandwitch");
		System.out.println("Burger");
	}
	
	public void disp1()
	{
		System.out.println("ColdDrinks");
		System.out.println("Tea");
		System.out.println("Coffee");
	}
}

public class TestMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Restaurants  a1=new Restaurants();
      a1.disp();
      a1.disp1();
	}

}
