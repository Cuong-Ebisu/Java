<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width: 100%">
		<tr>
			<td>VideoId</td>
			<td>Title</td>
			<td>Poster</td>
			<td>Views</td>
			<td>Description</td>
			<td>Active</td>
		</tr>
		<c:forEach var="i" items="${listvideo}">
			<tr>
				<td>${i.videoId }</td>
				<td>${i.title }</td>
				<td>${i.poster }</td>
				<td>${i.views }</td>
				<td>${i.description }</td>
				<td>${i.active }</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>