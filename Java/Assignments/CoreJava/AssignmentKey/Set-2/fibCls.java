import java.util.Scanner;


public class fibCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int next=1,sum,prev=0,i;
		int num;
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter number :  ");
	      num = in.nextInt();
	     for(i=0;i<=num;i++) {
	    	 System.out.print(prev +" ");
	    	 sum = prev+next;
	    	 prev=next;
	    	 
	    	 next=sum;
	    	 
	     }

	}

}
