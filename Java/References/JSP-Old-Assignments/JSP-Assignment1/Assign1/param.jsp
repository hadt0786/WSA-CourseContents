<%--Make an HTML form page that sends 3 parameters to a JSP page for display --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Name    = <%=request.getParameter("name") %><br>
Address = <%=request.getParameter("address") %><br>
City    = <%=request.getParameter("city") %>
</body>
</html>
