/*Write a program to convert the given temperature in Fahrenheit to Celsius using the following conversion formula 
C = F-32 / 1.8 and display the value in a tabular form. 
*/
import java.util.*;
public class ConvertTempInC
 {
   public static void main(String[] args)
   {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Temparature in Fahrenheit  (f):");
   //Reads the temperature in Farenheit
    double f = scan.nextDouble(); 
    //Converting to Celsius
    double c = ( f - 32 ) / 1.8;
    System.out.println("Fahrenheit"+"\t|  "+"Celsius ");
    System.out.println(f+"\t\t|     "+c);
   }
 }
     
         
 
