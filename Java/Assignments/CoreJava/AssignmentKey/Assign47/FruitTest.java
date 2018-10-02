/*
 * 47.Define a class called fruit with the following attributes:
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes.
 */

class Fruit
{
	String name,type;
	Double price;
//Parameterised Constructor
	Fruit(String name,String type,double price)
	{
		this.name=name;
		this.type=type;
		this.price=price;
	}
	//display values of attributes of Fruit class
	void displayFruit()
	{
		System.out.println("Name Of The Fruit     : "+name);
		System.out.println("Single or Bunch Fruit : "+type);
		System.out.println("Price Of The Fruit    :"+name);
		
	}
}
//main class
public class FruitTest {

	public static void main(String[] args) {
		// creating objects of fruit class
	Fruit ft1=new Fruit("Grapes","Bunch",65.25);
	Fruit ft2=new Fruit("Mango","Single",25.85);
	// calling the method to display values of fruit class attributes
	ft1.displayFruit();
	System.out.println("****************************************");
	ft2.displayFruit();
	
	}

}
