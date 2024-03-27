<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width:100%">
		<tr>
			<td>ProductID</td>
			<td>Count</td>
		
		</tr>
		<c:forEach var="i" items="${list}">
		<tr>
			<td>${i.productID}</td>
			<td>${i.productName}</td>
			
		
		</tr>
		</c:forEach>
	</table>
</body>
</html>