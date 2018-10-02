//Write Java program to compute the sum of the 2+4+6+---------+10

public class Series
{
    public static void main( String args[] )
   {
    	int sum = 0;
      
    
      for ( int i = 2; i<= 10; i+=2)
      {
    	  sum = sum + i;
       
      }
        System.out.println( "sum of 2+4+6+---------+10 = "+sum);
   }
}
