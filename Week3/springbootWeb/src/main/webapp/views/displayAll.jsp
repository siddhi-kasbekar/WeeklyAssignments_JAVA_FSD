<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.* , com.hexaware.springbootweb.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Display All</h2>

<%

List<Employee> list = (List<Employee>)session.getAttribute("empList");
out.println(list);



%>

</body>
</html>