//Write a java program for finding the sum, difference, product, quotient, minimum and maximum of any two integers 
import java.util.Scanner; // import Scanner  
      public class  Arithoperators 
     {  
         public static void main(String args[])  
          {  
       		Scanner input = new Scanner(System.in);  
     		int x; 
    		int y; 
 		System.out.print("Enter x and y values ");  
  		x = input.nextInt();  
    		y = input.nextInt();  
       
    		 System.out.printf("The sum of two integers is %d\n", (x + y ));  
        
   		 System.out.printf("The difference of two integers is %d\n", (x - y ));  
      
   		 System.out.printf("The product of two integers is %d\n", (x * y ));  
        
    		 System.out.printf("The quotient is %d\n",  (x + y )/2  );  
             
   		 if (x < y ) 
      		  {
         		System.out.printf("The smallest integer is %d\n",x); 
         		System.out.printf("The greatest integer is %d\n",y); 
    		  }
   		 else
    		 {
      			System.out.printf("The smallest integer is %d\n",y);  
      			System.out.printf("The greatest integer is %d\n",x); 
       		 } 
          }// end method main  
       
     }
