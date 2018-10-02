package com.emertxe;

/**
 * Program Detail: the code is to insert  new  records into   student table 
 * 
 * Author:Sandhya 
 * Written: 08/03/2016 
 * Last Update:
 * 
 * Compilation: javac JdbcInsert.java 
 * Execution: java JdbcInsert
 * Output:
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;



public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//PreparedStatment is used to execute parameterized query
			//we are passing parameter(?) for the values
			PreparedStatement ps =cn.prepareStatement("insert into student values(?,?)");
			ps.setString(1,"Smith");
			ps.setString(2,"usa");
			
			int i =ps.executeUpdate();
			System.out.println("records inserted");
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
