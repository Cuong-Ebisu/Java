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
			<td>author_id</td>
			<td>author_name</td>
			<td>date_of_birth</td>

		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td>${i.author_id }</td>
				<td>${i.author_name }</td>
				<td>${i.date_of_birth }</td>
			</tr>

		</c:forEach>
	</table>
	<c:forEach var="i" begin="1" end= "${count }" step="1">
		<a href="admin-ViewServlet?page=${i}">${i}</a>
	</c:forEach>
</body>
</html>