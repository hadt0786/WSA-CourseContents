import java.util.Scanner;


public class factCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fact=1;
		int i,num;
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter number :  ");
	      num = in.nextInt();
	      if ( num < 0 )
	          System.out.println("Number should be non-negative.");
	       else
	       {
	          for ( i = 1 ; i <= num ; i++ )
	             fact = fact*i;
	  
	          System.out.println("Factorial of "+num+" is = "+fact);
	       }
	       
	}

}
