<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.util.Date" %>
<%@page errorPage="error.jsp" %>
</head>
<body>
<div style="background:blue;">
	<h1 style="background:blue;color:white;">welcome to my page</h1>
	Current data:<%=new Date().toString() %>
	</div>
	<%! int a=100;
		int b=0;
	
	%>
	<%
		int division=a/b;
		
	%>
	<h1>division of number:<%=division %></h1>
	  
    
</body>
</html>