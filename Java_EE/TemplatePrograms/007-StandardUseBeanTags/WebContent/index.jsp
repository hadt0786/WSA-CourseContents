<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="obj" class="com.emertxe.Person" />

	<%
	
	
	obj.setName("vikas");
	
	String name = obj.getName();
	
	out.println(name);
	%>
	
	
	<%--set property tag--%>
	
	
	
	<jsp:setProperty name="obj" property="name" value="vikash Kumar" /> 
	
	<jsp:getProperty name="obj" property="name" /> 
</body>
</html>