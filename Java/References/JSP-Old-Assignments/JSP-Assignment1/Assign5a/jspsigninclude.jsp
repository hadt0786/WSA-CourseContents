<%-- Make a JSP 'signature block' page with your name and email address. Include it in another JSP page.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
This page includes the signature block page
</h1>
<jsp:include page="JspSignBlock.jsp" flush="true" />

</body>
</html>
