<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Visitors</title>
</head>
<body>
<form action="saveVisitor" method="post">
<pre>

<h2>Enter Visitors Details</h2>
Id:      	        <input type="text"name="id" value="${visitor.id}"readonly/>

permitNo 	        <input type="text"name="permitNo" value="${visitor.permitNo}"/>

dateValidFrom   	<input type="date"name="dateValidFrom" value="${visitor.dateValidFrom}"/>

dateValidTo     	<input type="date"name="dateValidTo" value="${visitor.dateValidTo}"/>

address 		<input type="text"name="address" value="${visitor.address}"/>

contactDetails  	<input type="text"name="contactDetails" value="${visitor.contactDetails}"/>

issuedBy		<input type="text"name="issuedBy" value="${visitor.issuedBy}"/>

comments      	        <input type="text"name="comments" value="${visitor.comments}"/>


<input type="submit" value="save"/>
</pre>

</form>

</body>
</html>