<%-- Write JSP code to generate department wise monthly attendance reports of employee.--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="java.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<%!String name; %>
<% name=request.getParameter("dept");
	try
	{
		//Register the Driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Establish the database Connection
   		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee where dept= '" + name + "'");
%>
		<form action=" " method="get">
		<h1 align="center">Employee monthly attendance Report</h1>
		<table border="1" cellspacing="5" cellpadding="10" align="center" bgcolor="lightgray">
			<tr> 
			<th>Ename</th><th>dept</th>
			<th>month</th><th>totaldays</th><th>No of days Present</th></tr>
  <%
		while(rs.next())
		{
  %>
			<tr>
			<td><%=rs.getString("ename") %></td>
			<td><%=rs.getString("dept") %></td>
			<td><%=rs.getString("month") %></td>
			<td><%=rs.getString("totaldays") %></td>
			<td><%=rs.getString("present") %></td>
			</tr>
			
     <%
		}
     %>
			</table>
			</form>
     <%
        }
	catch(Exception e)
	{
	
	}
     %>
</body>
</html>
