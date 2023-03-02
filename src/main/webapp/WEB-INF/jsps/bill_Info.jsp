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
<h2>Bill | details</h2>
<div>
${msg}
</div>
	InvoiceNumber:${billing.invoiceNumber}<br/>
	FirstName:${billing.firstName}<br/>
	LastName:${billing.lastName}<br/>
	Email:${billing.email}<br/>
	Mobile:${billing.mobile}<br/>
	Product:${billing.product}<br/>
	Amount:${billing.amount}<br/>
	
</body>
</html>