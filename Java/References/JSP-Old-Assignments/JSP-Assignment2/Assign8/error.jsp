<%-- Explain error handling in JSP with example. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Err.html">
<%@page isErrorPage="true"%>
<h2 align="center">Division By Zero Exception Occured</h2>
<input type="submit" value="Click-Again">
</form>
</body>
</html>
