<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Uploaded Image</title>
</head>
<body>
	<h2>Uploaded Image</h2>
    <img src="${pageContext.request.contextPath}/uploads/${filename}" alt="Uploaded Image" width="300" height="200"/>
</body>
</html>