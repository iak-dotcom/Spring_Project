<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Visitors</title>
</head>
<body>
	<h2>All Visitors</h2>
	<table>
		<tr>
			<th>id</th>

			<th>permitNo</th>

			<th>dateValidFrom</th>

			<th>dateValidTo</th>

			<th>address</th>

			<th>contactDetails</th>

			<th>issuedBy</th>

			<th>comments</th>
		</tr>

		<c:forEach items="${visitors}" var="visitor">

			<tr>
				<td>${visitor.id}</td>

				<td>${visitor.permitNo}</td>

				<td>${visitor.dateValidFrom}</td>

				<td>${visitor.dateValidTo}</td>

				<td>${visitor.address}</td>

				<td>${visitor.contactDetails}</td>

				<td>${visitor.issuedBy}</td>

				<td>${visitor.comments}</td>

				<td><a href="deleteVisitor?id=${visitor.id}">Delete </a></td>
				<td><a href="showUpdate?id=${visitor.id}">Edit</a></td>

			</tr>

		</c:forEach>
	</table>
	<a href="showCreate">Add Visitors</a>
</body>
</html>
