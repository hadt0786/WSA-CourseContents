import java.util.*;
class Vehicle
{
	String Company;
	Double price;
	Scanner sc=new Scanner(System.in);

	void read()
	{
		System.out.println("enter company name and price of bike");
		Company=sc.next();
		price=sc.nextDouble();
	}
	
}

class LightMotorVehicle extends Vehicle
{
	double mileage;
	void readm()
	{
		System.out.println("enter mileage");
		mileage=sc.nextDouble();
	}
	void display(){
		System.out.println("Company name of vehicle"+Company);
		System.out.println("Price of vehicle"+price);
		System.out.println("mileage of vehile="+mileage+"cc");
		
	}
	
}
class HeavyMotorVehicle extends Vehicle
{
	double capacity;
	void readc()
	{
		System.out.println("enter capacity");
		capacity=sc.nextDouble();
	}
	void display(){
		System.out.println("Company name of vehicle"+Company);
		System.out.println("Price of vehicle"+price);
		System.out.println("Capacity of vehile="+capacity+"tons");
		
	}
	
}
public class VehicleDetails {

	public static void main(String[] args) {
		String type;
		int n;
		LightMotorVehicle lmv=new LightMotorVehicle();
		HeavyMotorVehicle hmv=new HeavyMotorVehicle();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of how many number of vehicles you want to read");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
 
	  System.out.println("enter "+i+" LightMotorVehicle vehicle details");
	  lmv.read();
	  lmv.readm();
	    }

	for(int i=1;i<=n;i++)
	{
	System.out.println("enter "+i+" HeavyMotorVehicle vehicle details");
    hmv.read();
	  hmv.readc();
	}
	System.out.println("enter type of vehicle to display");
	type=sc.next();
	for(int i=1;i<=n;i++)
	{
		 if(type=="LightMotorVehicle")
		  {
		System.out.println(i +" LightMotorVehicle Details");
			 lmv.display();
		  }
		 else
		 {
			 System.out.println(i+" HeavyMotorVehicle Details");
		hmv.display();
		 }
		 }
	}
	
}
