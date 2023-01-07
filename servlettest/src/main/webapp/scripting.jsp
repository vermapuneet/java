<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:#F0F0F0;">
<h1> hello world</h1>
<%!

int a=23;
int b=34;
int c;

void  sum()
{
	c=a+b;
	
}
void method()
{
	sum();
}
%>

<%
out.println(c);

sum();

%>
<h1>value of b:<%=b %></h1>
</body>
</html>