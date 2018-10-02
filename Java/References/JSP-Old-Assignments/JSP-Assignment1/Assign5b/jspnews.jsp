<%-- The value of the page attribute of jsp:include is allowed to be a JSP expression. Make a JSP page that includes a 'good news' page or a 	  'bad news' page at random.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
<% String news;
   if (Math.random() < 0.5)
     news="goodnews.jsp";
   else
     news="badnews.jsp";
%>
<jsp:include page="<%= news%>" flush="true" />
</body>
</html>
