<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hi</h1>
<%
String m=request.getParameter("fname");
String m1=request.getParameter("lname");
String m2=request.
int n=Integer.parseInt(m);
int n1=Integer.parseInt(m1);
double sum=n+n1;
%>
<br>
<hr>
<p>---------------------------</p>
sum of two number is:<%=sum %>
</body>
</html>