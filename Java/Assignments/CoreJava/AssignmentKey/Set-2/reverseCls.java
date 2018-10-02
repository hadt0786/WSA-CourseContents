import java.util.Scanner;


public class reverseCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int rev =0;
		int num;
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter number :  ");
	      num = in.nextInt();
	      while( num != 0 )
	      {
	    	  rev = rev * 10;
	    	  rev = rev + num%10;
	    	  num = num/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+rev);

	}

}
