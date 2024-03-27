<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "update" method = "post">
		<label>Nhap catefory name:</label>
		<input type = "text" name = "cateName" value = "${cate.cateName }">
		<label>Nhap link icon:</label>
		<input type = "text" name = "images" value = "${cate.image }">
		<input type = "submit" value = "add category">
	</form>
</body>
</html>