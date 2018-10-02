package com.emertxe;

/**
 * Program Detail: the code is to update   records into   student table 
 * 
 * Author:Sandhya 
 * Written: 08/03/2016 
 * Last Update:
 * 
 * Compilation: javac JdbcUpdate.java 
 * Execution: java JdbcUpdate
 * Output:
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//PreparedStatment is used to execute parameterized query
			//we are passing parameter(?) for the values
			PreparedStatement ps =cn.prepareStatement("update student set Name =? where address =?");
		
			ps.setString(1,"john");
			ps.setString(2, "patna");
			
			int i =ps.executeUpdate();
			System.out.println("records updated");
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
