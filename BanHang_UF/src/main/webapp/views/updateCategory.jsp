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
	<form action="update" method="post">
		<label>cateID:</label>
		<input type = "text" name="cateID" value="${cate.cateID}" readonly="readonly">
		<label>Nhap cateName:</label>
		<input type = "text" name="cateName" value="${cate.cateName}">
		<label>Nhap icon:</label>
		<input type = "text" name="image" value="${cate.image}">
		
		<input type="submit" value="Update Category">
	</form>
</body>
</html>