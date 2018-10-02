// Write a program to calculate the area of triangle, square, circle, rectangle by using  method overloading. 

import java.io.*;
class AreaOverloading
{
	//Overloading with two parameters
	void area(int a, int b)
   	 {
           System.out.println( "\n Area of rectangle with breadth "+a+" and lenght " +b+ " is :" + a*b);
    	 }
	//Overloading with single parameter
	void area(int a)
       	{
           System.out.println( "\n Area of circle with  radius " +a+ " is :" + 3.14 * a);
	}
	//Overloading with three parameters
	void area(int a, int b, int c)
    	{
      	   double temp = (a + b + c);
       	   double s = temp/2;
       	   double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
           System.out.println( "\n Area of triangle with lenght of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
	}
	public static void main(String args[]) throws IOException
         {
		AreaOverloading Aovr = new AreaOverloading();
		int choice;
     		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" \n 1 . Rectangle \n 2 . Triangle \n 3 . Circle ");
		System.out.println("Enter the choice");
 		choice = Integer.parseInt(br.readLine());
	    switch(choice)
             {
   		 case 1:
        	 	System.out.print("\n Enter the length : ");
         		int a = Integer.parseInt(br.readLine());
         		System.out.print("\n Enter the breadth : ");
         		int b = Integer.parseInt(br.readLine());
         		Aovr.area(a,b);
          		break;
   		 case 2:
      			System.out.print("\n Enter the lenght of first side : ");
        		int x = Integer.parseInt(br.readLine());
       			System.out.print("\n Enter the lenght of second side : ");
       			int y = Integer.parseInt(br.readLine());
        		System.out.print("\n Enter the lenght of third side : ");
        		int z = Integer.parseInt(br.readLine());
         		Aovr.area(x,y,z);
         		break;
   		 case 3:
       			System.out.print("\n Enter the radius : ");
        		int r = Integer.parseInt(br.readLine());
        		Aovr.area(r);
        		break;
    		default:
         		System.out.println("Please select between 1 to 3");
        		break;
             }
  
         }
}
