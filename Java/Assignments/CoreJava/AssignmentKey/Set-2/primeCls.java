import java.util.Scanner;


public class primeCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a number: ");      
	    n = in.nextInt();
	    int i, res;
		boolean flag=true;		
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}


}
