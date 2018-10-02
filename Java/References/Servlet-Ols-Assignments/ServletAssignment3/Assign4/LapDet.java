package Sessiontrack;

import java.io.IOException;
import java.sql.Connection;
/* Write a program to develop a online application for purchase Laptop using servlet, jdbc.
(Hint: use http session). Create a database which store Laptop name, cost, screensize, ramcapacity,  totallaptops.*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LapDet extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String lname;
		int lcost,lsize,lcapacity;
		HttpSession sess = request.getSession(true);
			try
			{
				//retrieve values from lap.html
				lname = request.getParameter("name");
				lcost = Integer.parseInt(request.getParameter("cost"));
				lsize = Integer.parseInt(request.getParameter("size"));
				lcapacity = Integer.parseInt(request.getParameter("capacity"));
				//Set the attribute values
				sess.setAttribute("lpname", lname);
				sess.setAttribute("lpcost", lcost);
				sess.setAttribute("lpsize", lsize);
				sess.setAttribute("lpcapacity", lcapacity);
				//Forward to LapDet2.java
				RequestDispatcher rd = request.getRequestDispatcher("LapDet2");
				rd.forward(request, response);
		   
			}
			catch(Exception e)
			{
				System.out.println("\nError :"+e); 
				e.printStackTrace();
			}
		
		
	}
 }
