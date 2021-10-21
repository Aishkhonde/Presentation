<%@page import="model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% ArrayList<Book> barr = (ArrayList<Book>) request.getAttribute("barr"); %>
<table border="1">

<% for (Book b: barr){%>
<tr>
<td><%out.println(b.getBookid()); %></td>
<td><%out.println(b.getBookname()); %></td>
<td><%out.println(b.getBookprice()); %></td>
</tr>
<%} %>

</table>

</body>
</html>