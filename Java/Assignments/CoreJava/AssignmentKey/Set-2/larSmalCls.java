import java.util.Scanner;


public class larSmalCls {
	public static void main(String[] args) {
		 int small=0;//est = Integer.MAX_VALUE;
	        int large = 0;
	        int num;

	        System.out.println("enter the number");

	        Scanner input=new Scanner(System.in);

	        int n=input.nextInt();

	        for(int i=0;i<n;i++)
	        {
	          num=input.nextInt();
	          if(num>large)
	          {
	           large=num;
	          }
	          if(i==0&&num>0)
	        	  small=num;
	          if(num<small)
	        	  small=num;
	    

	      }
	        System.out.println("the largest is:"+large);
	        System.out.println(" the smallest is:"+small);
	}
}
