<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>You have visited <a href="#">Http://localhost:8080</a>:  <c:out value= "${ count }" /> times.</p>
<p><a href = "/">Test another visit?</a></p>
<p><a href = "/clear">Clear Session</a>
	
</body>
</html>