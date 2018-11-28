import java.util.*;

// Program to add, subtract ,multiply and divide two numbers using switch statement 
// Author :Sandhya
public class MenuDriven {

	public static void main(String[] args){
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int ch,a=5,b=6,sum,sub,multi;
    char ans;
     float div;
     do
     {
    System.out.println("1.Add");
    System.out.println("2.Subtract");
    System.out.println("3.Multiply");
    System.out.println("4.Divide");
    System.out.println("5.Exit");
    System.out.println("Enter the choice[1-5]");
		ch=sc.nextInt();
	 switch(ch)
	 {
	 case 1:
		 sum=a+b;
		 System.out.println("Sum of two numbers"+sum);
		 break;
	 case 2:
		 sub=a-b;
		 System.out.println("Subtraction of two numbers"+sub);
		 break;
	 case 3:
		 multi=a*b;
		 System.out.println("Multiplication of two numbers"+multi);
		 break;
	 case 4:
		 div=a/b;
		 System.out.println("Division of two numbers"+div);
		 break;
	 case 5:
		
		 System.exit(0);
		 break;
		 default :
			 System.out.println("invalid ch");
	 }
	 System.out.println("Continue(y/n)");
	 ans =sc.next().charAt(0);
     }while (ans!='n');
	}

	
		 
		 
	 
	}


