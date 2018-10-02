// Program to show default constructor and parameterized constructor
// Author :Sandhya

class Vehicle {

	// Defining default constructor

	Vehicle()
	{

		System.out.println("Vehicle");

	}

	// Defining parameterized constructor

	Vehicle(int a) {

		System.out.println("Parameterised Constructor"+a);

	}

}

public class ConstrucTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c1 = new Vehicle();// calling the default constructor
	Vehicle c2 = new Vehicle(5);// calling the parameterized constructor

	}

}
