/*
* Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations. 
 (For example if the three digits are 1, 2, 3 * than all possible combinations are: 123,  132,213, 231, 312, 321.) 
*/
import java.util.Scanner;
class PossibleCmb
 {
    //using the logic of reversing the number for combinations
  public static int palin(int n)
   {
     int num = 0, rev = 0, rem;
     num = n;
     while (num!=0)
      {
        rem = num%10;
        num = num/10;
        rev = (rev*10)+rem;
      }
  	return rev;
   }
   public static void main(String[] args)
   {
	  int digit,rem;
	  System.out.println("enter 3 digits");
	  Scanner sc = new Scanner(System.in);
	  digit = sc.nextInt(); //read the number
          //using the logic of reversing the number for combinations
	  for ( int j = 0; j<2; j++)
 	   {
 	     for ( int i = 0; i<3; i++)
  	      {
    		 rem = digit%10;
    		 digit = digit/10;
 		 digit = (rem*100)+digit;
    		System.out.println("numbers are:"+digit);
              }
   		digit = palin(digit);  //calling palin(int n) function
  	   }
   }
   
 }
