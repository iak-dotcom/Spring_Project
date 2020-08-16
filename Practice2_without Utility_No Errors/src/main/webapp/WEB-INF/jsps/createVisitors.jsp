<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Visitors</title>
</head>
<body>
<form action="saveVisitor" method="post">
<pre>

<h2>Enter Visitors Details</h2>
Id:      	        <input type="text"name="id"/>

permitNo 	        <input type="text"name="permitNo"/>

dateValidFrom   	<input type="date"name="dateValidFrom"/>

dateValidTo     	<input type="date"name="dateValidTo"/>

address 		<input type="text"name="address"/>

contactDetails  	<input type="text"name="contactDetails"/>

issuedBy		<input type="text"name="issuedBy"/>

comments      	        <input type="text"name="comments"/>

<input type="submit"value="save"/>
</pre>

</form>
${msg}
<a href="displayVisitors"> View All Visitors</a>
</body>
</html>