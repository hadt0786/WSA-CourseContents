/*Write a program that calls a method that throws an exception of type ArithmeticExcepton  at a random iteration in a for loop. Catch the   exception in the method and pass the  iteration count when the exception occurred to the calling method by using an object of  an exception class you define.
*/
public class IteratedArithmeticException extends Throwable 
{  
  
  // Default Constructor:  
  public IteratedArithmeticException()
  {
  }  
  // Standard constructor:  
  public IteratedArithmeticException(String s, Throwable cause)
  {  
    super(s, cause); // Call the base constructor.  
  }  
  
  public IteratedArithmeticException(int iteration, Throwable cause)
  {  
    super(cause);  // Call the base constructor.  
    this.iteration = iteration; // Set the iteration number.  
  }  
  public int getIteration() 
  {  
    // Get the array index value for the error.  
    return iteration;  // Return the iteration number.  
  }  
  
  // The default value of -1 can be used to check whether an iteration number was stored  
  private int iteration = -1;                                          // Iteration number at which exception occurred.  
}  

public class TestIterated
 {  
  public static void main(String args[])
  {  
    try
    {  
      emertxe();                                                         // Call the method that will throw the exception.  
    } 
    catch(IteratedArithmeticException e)
    {  
      System.out.println("Originating exception was: " + e.getCause());  
      int iteration = e.getIteration();  
      if(iteration < 0)
      {  
        System.out.println("Iteration count not recorded");  
      }
      else
      {  
        System.out.println("Iteration count when exception occurred: " + iteration);  
      }  
    }  
  }  
  
 	 // This method throws an exception - eventually:  
  	static void emertxe() throws IteratedArithmeticException
 	 {  
  	  int iteration = 0;                                                 // Iteration counter.  
    	  int result = 0;                                                    // Stores a result.  
   	   int divisor = 0;                                                   // Random divisor.  
  
    		// Loop will continue until an exception is thrown:  
    		for(iteration = 0 ; ; ++iteration)  
     		 try
		 {  
       		   divisor = (int)(100*Math.random());                            // Generate a random divisor.  
                   result = 1000/divisor;                                          
      		 }
		 catch(ArithmeticException e) 
		{  
                  throw new IteratedArithmeticException(iteration, e);  
      		}  
         }  
}  

