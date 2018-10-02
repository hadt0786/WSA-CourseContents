<%--    The java.math package has a class called BigInteger that lets you create whole numbers 
	with an arbitrary number of digits. Create a JSP page that makes a large BigInteger 
	from a String you supply as a request parameter, squares it, and prints out the result.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "lightpink">
<H1 align = "center"> Square Of Big Integers</H1>
<%@ page import="java.math.*" %>
<% String num = request.getParameter("number");
   BigInteger result;
   BigInteger orig = new BigInteger(num);
 %>
<h3>The square of <%=orig %> is <%=orig.pow(2) %></h3>


</body>
</html>
