import java.util.Scanner;

//  program to enter a digit [1234]  and reverse[4321] it
// Author :Sandhya
public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any digit");
		n=sc.nextInt();
		int t,r=0,s=0;
		while(n!=0)
		{
			t=n%10;
			r=r*10+t;
			n=n/10;
			//s=s+t;
		}
		
		System.out.println("reverse digit"+r);
	}

}
