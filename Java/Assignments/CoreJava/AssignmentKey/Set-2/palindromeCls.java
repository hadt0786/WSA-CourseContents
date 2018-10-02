import java.util.Scanner;


public class palindromeCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,n;
		int rev=0;
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter number :  ");
	      num = in.nextInt();
	      n= num;
	      while( num != 0 )
	      {
	    	  rev = rev * 10;
	    	  rev = rev + num%10;
	    	  num = num/10;	    	  
	      }
	      if(n == rev) {
	    	  System.out.println("The given number is Palindrome.");
	      } else {
	    	  System.out.println("The given number is not Palindrome.");
	      }

	}

}
