<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Page No: ${spageid}</h1>
	<table border='1' style="width: 100%">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Salary</td>
		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td>${i.id }</td>
				<td>${i.name }</td>
				<td>${i.salary }</td>
			</tr>

		</c:forEach>
	</table>
	<c:forEach var="i" begin="1" end= "${count }" step="1">
		<a href="ViewServlet?page=${i}">${i}</a>
	</c:forEach>

</body>
</html>