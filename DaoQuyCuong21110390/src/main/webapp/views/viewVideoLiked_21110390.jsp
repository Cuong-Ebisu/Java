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
	<h2>Videos by Likes</h2>
	<table border="1" style="width: 100%">
		<tr>
			<th>Title</th>
			<th>Poster</th>
			<th>Views</th>
			<th>Description</th>
			<th>Active</th>
			<th>Category</th>
		</tr>
		<c:forEach var="video" items="${videosByLikes}">
			<tr>
				<td>${video.title}</td>
				<td>${video.poster}</td>
				<td>${video.views}</td>
				<td>${video.description}</td>
				<td>${video.active}</td>
				<td>${video.category.categoryName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>