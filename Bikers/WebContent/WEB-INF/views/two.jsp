<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jstl/core_rt" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>The Following are the required Details </h1>
<table align="center" cellpadding="5" cellspacing="5" border="1" >

		<tr>
			<th>Reg No </th>
			<th>Company Name</th>
			<th>Bike Model</th>
			<th>Engine Name</th>
			<th>User Name</th>
		</tr>
  
		
			<tr>
				<td>${products.regNo}</td>
				<td>${products.bikeCompany}</td>
				<td>${products.bikeModel}</td>
				<td>${products.engineNo}</td>
				<td>${products.name }</td>
			</tr>
		
   



</table>
 <h2>Thank You</h2>
</body>
</html>