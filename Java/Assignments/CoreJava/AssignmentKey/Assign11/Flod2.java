/*
Shown below is a Floyd’s triangle 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
Write a program to print this triangle. (Flod2.java)
*/

import java.util.Scanner;
 
class Flod2
{
   public static void main(String args[])
   {
       int n, num = 1, c, d;
       Scanner in = new Scanner(System.in);
       System.out.println("Floyd's triangle :-");
 
      for ( c = 1 ; c <= 5 ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
         {
            System.out.print(num+" ");
            num++;
         }
 
          System.out.println();
      }
   }
}
