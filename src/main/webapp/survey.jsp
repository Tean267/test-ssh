<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Survey</title>
<link rel="stylesheet" href="Styles/main.css" type="text/css"/>

</head>
<body>
	<h1>Thanks for taking our survey!</h1>
	<p>Here is the information that you entered:</p>
	<label>Email:</label>
	<span>${user.email}</span><br>
	<label>First Name:</label>
	<span>${user.firstName}</span><br>
	<label>LastName:</label>
	<span>${user.lastName}</span><br>
	<label>Heard From: </label>
	<c:forEach items="${user.hearAbout}" var="x">
			<p>${x} </p>
	</c:forEach>
	<br>
	<label>Updates:</label>
	<span>${user.update}</span><br>
	<c:if test="${user.update=='yes'}">
		<label>Contact Via:</label>
		<span>${user.contact}</span><br>
	</c:if>
	
	
</body>
</html>