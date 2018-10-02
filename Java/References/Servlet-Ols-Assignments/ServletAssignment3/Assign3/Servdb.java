package Sessiontrack;
/* Write a program using servlet, Jdbc to read employee id and display the information from database like employee name, address, cellno, dob, doj, salary and display a message “employee not exist” if employee id is not present in database?
*/
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servdb extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 int id;
	         PrintWriter pw= response.getWriter();
	         id=Integer.parseInt(request.getParameter("id"));
	         try
	     	{
	     		Class.forName("com.mysql.jdbc.Driver").newInstance();
	     		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
	        	Statement st = con.createStatement();
	       		 ResultSet rs=st.executeQuery("select * from employee where eid='" + id + "'");
	        
	        	if(rs.next())
	        	{
	        	 pw.println("Name = "+rs.getString(1));
	        	 pw.println("Address" +rs.getString(2));
	        	 pw.println("cellno = "+rs.getInt(3));
	        	 pw.println("Date of Birth = " +rs.getDate(4) );
	        	 pw.println("Date Of Join = "+ rs.getDate(5));
	        	 pw.println("Salary = "+rs.getDouble(6));
	        	}
	        	else
	        	{
	        	 pw.println("Employee not exists");
	        	}
	        
	     	}
	         catch(Exception e)
	         {
	        	 
	         }
	         
	         
	}

	

}
