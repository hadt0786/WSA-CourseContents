<%--	Write JSP code to accept product details and store in database table. If the product is already inserted, display the appropriate 		message to insert another product.
-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@page import="java.sql.*;" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name,code;
int totalprd,cost; %>
<%name=request.getParameter("pname"); 
  code=request.getParameter("pcode"); 
  totalprd=(Integer.parseInt(request.getParameter("pnum"))); 
  cost=(Integer.parseInt(request.getParameter("pcost"))); 

      try
      {
	//Register the Driver
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	//Establish the database Connection
   	Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from product");
	while(rs.next())
	{
		String cd=rs.getString(2);
		if(code.equalsIgnoreCase(cd))
		{
%>
			<h3 align="center"> Product already exists </h3>
  <%
		}
	}
	
		PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?,?)");
		pst.setString(1,name);
		pst.setString(2,code);
		pst.setInt(3,totalprd);
		pst.setInt(4,cost);
		 pst.executeUpdate();
	
  %>
		<h3>Product details successfully inserted</h3>
  <%
	}	  

	catch(Exception e)
	{
	 }
  %>
	     
</body>
</html>
