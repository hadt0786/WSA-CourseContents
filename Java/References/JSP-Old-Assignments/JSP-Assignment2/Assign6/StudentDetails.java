package com.emertxe;
/* Write JSP code which adds the student education details in a database through Java bean. Also display the student details who have secured first class in their graduation.*/
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDetails
{
	  private int sid;
	  private String sname;
	  private int sjava, sservlet, sjsp;
	  private Connection con=null;
	  private ResultSet rs = null;

	  public StudentDetails() 
	  {

		  try 
		  {
			  //Register the Driver
			   Class.forName("com.mysql.jdbc.Driver").newInstance();
			  //Establish the database Connection
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
			
		  }
		  catch(Exception e)
		  {
			  System.out.println("Exception is ;"+e);
		  }
	  }  
	  public void setsid(int sid)
	  {
	  this.sid = sid;
	  }
	  public int getmsgid()
	  {
	  return (sid);
	  }
	  
	  public void setSname(String sname)
	  {
	  this.sname = sname;
	  }
	  public String getSname()
	  {
	  return (sname);
	  }
	  
	  public void setsjava(int sjava)
	  {
	  this.sjava = sjava;
	  }
	  public int getsjava()
	  {
	  return (sjava);
	  }
	  
	  public void setsservlet(int sservlet)
	  {
	  this.sservlet = sservlet;
	  }
	  public int getsservlet()
	  {
	  return (sservlet);
	  }
	  
	  public void setsjsp(int sjsp)
	  {
	  this.sjsp = sjsp;
	  }
	  public int getsjsp()
	  {
	  return (sjsp);
	  }
	  
	  public void insert()
	  {
  		 try
		 {
  		 Statement st = con.createStatement();
  		 st.executeUpdate ("insert into studentdetails values('"+sid+"','"+sname+"','"+sjava+"','"+sservlet+"','"+sjsp+"')");
  		 st.close ();
        
	  	 }
  	 	catch(Exception e)
	  	{
	  	System.out.println("Exception is :"+e);

	  	}

	  }
}

