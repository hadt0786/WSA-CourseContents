/*Write a java program to find the roots of a quadratic equation. Assign the values of a, b and c of the equations in the program itself.*/
public class QuadraticEqRoots
{
    public static void main(String[] args)
    {
        /*
         * General form of a Quadratic Equation is
         * ax2 + bx + c = 0 where 'a' is not equal to 0
         * Hence a = 2, b = 6 and c = 4.
         */
        	 int a = 2;
       		 int b = 6;
       		 int c = 4;
 
     	//Finding out the roots
       	 	double temp1 = Math.sqrt(b * b - 4 * a * c);
        	double root1 = (-b +  temp1) / (2*a) ;
       		double root2 = (-b -  temp1) / (2*a) ;
 
        System.out.println("The roots of the Quadratic Equation are "+root1+" and "+root2);
     }
}
