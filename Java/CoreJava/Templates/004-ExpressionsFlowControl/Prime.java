import  java.util.*;
// Program to check whether a number entered is prime or not
// Author :Sandhya
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a number: ");      
	    n = in.nextInt();
	    boolean flag=true;
	    int i, res=0;
			
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if( flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}

}
