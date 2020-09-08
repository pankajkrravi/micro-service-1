<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${devices.brandName}Devices</title>
</head>
<body>
	<h4>Welcome to Online SamsungStore !!</h4>
	<hr />
	<h3>List of ${devices.brandName} devices</h3>
	<hr>
	<ul>
		<c:forEach var="device" items="${devices.devices}">
			<li>name: ${device.name} -> category: ${device.type}</li>
			<br />

		</c:forEach>
	</ul>
</body>
</html>