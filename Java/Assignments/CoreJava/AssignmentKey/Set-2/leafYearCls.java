import java.util.Scanner;


public class leafYearCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter year Value:  ");
	       int yearVal = in.nextInt();
	       if(yearVal%4 == 0) {
	    	   System.out.println("The given year is Leaf year");
	       } else {
	    	   System.out.println("The given year is not Leaf year");
	       }
	       
	      

	}

}
