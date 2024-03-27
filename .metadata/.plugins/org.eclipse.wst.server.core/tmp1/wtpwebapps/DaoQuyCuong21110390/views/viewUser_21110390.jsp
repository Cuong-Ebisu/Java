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
			<td>CategoryId</td>
			<td>CategoryName</td>
			<td>CategoryCode</td>
			<td>Images</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
		<c:forEach var="i" items="${list }">
			<tr>
				<td>${i.categoryId }</td>
				<td>${i.categoryName }</td>
				<td>${i.categoryCode }</td>
				<td>${i.images }</td>
				<td>${i.status }</td>
				<td>
				<a href = "<c:url value = '/admin-update?id=${i.categoryId }' />">Update</a> || 
				<a href = "<c:url value = '/admin-delete?id=${i.categoryId }' />">Delete</a>
			</td>
			</tr>

		</c:forEach>
	</table>
	<c:forEach var="i" begin="1" end= "${count }" step="1">
		<a href="admin-ViewServlet?page=${i}">${i}</a>
	</c:forEach>
</body>
</html>