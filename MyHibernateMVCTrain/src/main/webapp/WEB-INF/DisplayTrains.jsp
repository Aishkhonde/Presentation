<%@page import="model.Trains"%>
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


<% ArrayList<Trains> barr = (ArrayList<Trains>) request.getAttribute("barr"); %>
<table border="1">

<% for (Trains b: barr){%>
<tr>
<td><%out.println(b.getTrainno()); %></td>
<td><%out.println(b.getTrainname()); %></td>
<td><%out.println(b.getSource()); %></td>
<td><%out.println(b.getDestination()); %></td>
<td><%out.println(b.getTicketprice()); %></td>
</tr>
<%} %>

</table>

</body>
</html>