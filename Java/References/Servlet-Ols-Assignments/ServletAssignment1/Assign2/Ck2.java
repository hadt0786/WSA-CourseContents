package Sessiontrack;
/*
2.Write a servlet code to do the following
i)Get Userid and parameter values from login.html and set are create cookies of it.
ii)Retrieve these setcookies and verify the user validity from the table
(Assume suitable table structure
*/

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ck2 extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	PrintWriter pw=response.getWriter();
	String psd = null,id=null;
	int uid = 0;
	try
	{
		//Register the Driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Establish the database Connection
	   	Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
   		Statement st = con.createStatement();
   		
		//retreiving values from cookies
		Cookie ck[] = request.getCookies();
		if(ck!=null)
		{
			psd=ck[1].getValue();
		
		}
   			ResultSet rs = st.executeQuery("select * from jisu where name= '" + psd + "'");
  
 		if(rs.next())
		{
			pw.println("user exists with id = " +rs.getInt(1)+"password = "+ rs.getString(2));
		}
 		else
 		{
		 pw.println("user doesnot exists");
 		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
   }
}
