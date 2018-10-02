//Write Java program to print the squares and cubes for the numbers 1 to 5
public class NumSquareCube
 {
   public static void main( String args[] )
      {
	         int Square;
	         int Cube;
	      	 System.out.println("Number"+"\t"+ "Square"+"\t"+ "Cube");
	       //Calculating square and cube of a number
	        for ( int i = 1; i <= 5; i++ )            
	         {                                                          
	           Square = i*i;
	            Cube = i*i*i;             
	           System.out.println( i+"\t"+ Square+"\t"+ Cube );
	         }                                       
      }
 }  
