<%@page import="com.getweather.weatherapp.model.Error"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isErrorPage="true"%>
<%
	Error error = (Error) request.getSession().getAttribute("Error");
	request.getSession().removeAttribute("Error");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="refresh" content="5;URL='http://localhost:8080/weatherapp/'" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<%if (error != null)
	{%>
<title><%="Error"+error.getCod() %></title>
<%} else{ %>
<title>Oops!! Some Error has occurred</title>
<% }%>
</head>
<body>
	<%if(error != null){%>
	
	 <div style="text-align: center;">
	 <h3>
	 <p><%=error.getMessage() %></p>
	 <p>Wait. You will be automatically redirected to Main Page in 5 seconds.</p>
	 </h3>
	 </div>
	<%}else{ %>
		<div style="text-align: center;"><p><h3><%=exception.getMessage() %></h3></p>
		 <p>Wait. You will be automatically redirected to Main Page in 5 seconds.</p>
		</div>
	<%}%>
		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>