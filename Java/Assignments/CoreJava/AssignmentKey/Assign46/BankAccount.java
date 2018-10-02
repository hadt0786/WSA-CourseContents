import java.io.*;
import java.util.*;
 class Account
{
	String custname,acctype;
	int accno;
	double balance;
	Scanner sc= new Scanner(System.in);
	void read()
	{
		System.out.println("enter account number");
		accno=sc.nextInt();
		System.out.println("enter customer name");
		custname=sc.next();
		System.out.println("enter acctype type");
     		acctype=sc.next();
     		System.out.println("enter amount ");
     		balance=sc.nextDouble();
	}
	
}
 class Curr_acct extends Account
 {
	 double amt;
	 void deposit()
	 {
		 System.out.println("account details of Current");
		 display();
		 System.out.println("enter amount to deposit");
		 amt=sc.nextDouble();
		 balance+=amt;
		 System.out.println("account details after deposit");
		 display();
		 
	 }
	 void withdrawal()
	 { 
		 System.out.println("enter amount to withdraw");
	 amt=sc.nextDouble();
	 balance-=amt;
	 System.out.println("account details after withdraw");
	 display();
	 
	 }
	 void display()
	 {
		System.out.println("Acount numner:"+ accno);
		System.out.println("Customer name:"+ custname);
		System.out.println("Sccount Type:"+ acctype);
		System.out.println("Balance in account"+ balance);
	 }
 }
 class Sav_acct extends Account
 {
	 double amt,ci,x;
	 double n;
	 void read1()
		{
			System.out.println("enter account number");
			accno=sc.nextInt();
			System.out.println("enter customer name");
			custname=sc.next();
			System.out.println("enter acctype type");
	     		acctype=sc.next();
	     		System.out.println("enter amount ");
	     		balance=sc.nextDouble();
	     		System.out.println("enter number of years");
	     		n=sc.nextDouble();
		}
	 void deposit()
	 {
		 System.out.println("account details of Savings");
		 display();
		 System.out.println("enter amount to deposit");
		 amt=sc.nextDouble();
		 balance+=amt;
		 CompdIntrest();
			 
	 }
	 void withdrawal()
	 {
		 System.out.println("enter amount to withdraw");
		 amt=sc.nextDouble();
		 balance-=amt;
		 if(balance <500)
		 {
			 balance-=200;
			 System.out.println("Penality for less balance");
			 System.out.println("account details after withdraw");
			 display();
		 }
		 else
		 {
			 System.out.println("account details after withdraw");
			 display();
		 }
		 
	 }
	 void CompdIntrest()
	 {
		 x=1.2*n;
		 double y=(double)0.5/2;
		 ci=balance*(1+Math.pow(y,x));
		 balance=balance+ci;
		 System.out.println("account details after deposit and compount intrest");
		 display();
	 }
	 void display()
	 {
		System.out.println("Acount numner:"+accno);
		System.out.println("Customer name:"+custname);
		System.out.println("Sccount Type:"+acctype);
		System.out.println("Balance in account"+balance);
	 }
	 
 }

public class BankAccount
 {

	public static void main(String[] args)
	 {
	
		Account act= new Account();
		Curr_acct ct=new Curr_acct();
		Sav_acct st=new Sav_acct();

		String actyp;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter account type");
		actyp=sc.next();
		if(actyp=="current")
		  {
			ct.read();
			ct.deposit();
			ct.withdrawal();
		  }
		else
		{
			st.read1();
			st.deposit();
			st.withdrawal();
		}
	 }
 }
