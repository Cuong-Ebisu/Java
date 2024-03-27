<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1" style = "width:100%">
		<tr>
			<td>ID</td>
			<td>CateName</td>
			<td>Icon</td>
			<td>Action</td>
		</tr>
		<tbody>
		<c:forEach var = "i" items = "${list }">
			<tr>
				<td>${i.cateID }</td>
				<td>${i.cateName }</td>
				<td>${i.image }</td>
				<td><a href = "update?id=${i.cateID }">Update</a> || Delete</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>