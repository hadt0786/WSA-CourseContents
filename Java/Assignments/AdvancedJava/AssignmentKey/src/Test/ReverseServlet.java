package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReverseServlet extends HttpServlet{
	  public void doGet(HttpServletRequest request, 
			  HttpServletResponse response)
			  throws ServletException, IOException {
		  // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      Scanner input =new Scanner(System.in);
	      System.out.println("Enter your String: ");
	      String str =input.nextLine(); 
	      String reverseStr="";
			 for(int i=str.length()-1;i>=0;i--) {
				 reverseStr =reverseStr+str.charAt(i);
			 }
	      PrintWriter out = response.getWriter();
	      out.println("<h1>"+ "The Reverse String of "+str+" is " +reverseStr+"</h1");
	      
		  }
}
