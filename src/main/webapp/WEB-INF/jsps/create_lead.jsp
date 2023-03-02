<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create | Lead</h2>
	<form action="save" method="post">
	<table>
		<tr>
		<td>FirstName</td>
		<td><input type="text" name="firstName"></td>
		<tr>
		<td>LastName</td>
		<td><input type="text" name="lastName"></td>
		<tr>
		<td>Email</td>
		<td><input type="text" name="email"></td>
		<tr>
		<td>Mobile</td>
		<td><input type="text" name="mobile"></td>
		<tr>
		<td>Source:</td>
		<td><select name="source">
		<option value="newspaper">NewsPaper</option>
		<option value="website">Website</option>
		<option value="tradeshow">TradeShow</option>
		<option value="radio">Radio</option>
		</select></td>
	</table>
	<input type="submit" value="save"/>
	</form>
</body>
</html>