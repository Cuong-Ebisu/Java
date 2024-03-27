<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin-insertpro" method= "post" enctype="multipart/form-data">
	 	<label>Nhập product name: </label>
	 	<input type = "text" name = "productName"><br>
	 	<label >Nhập desc: </label>
	 	<textarea name = "description" cols = "5" class = "form-control" style = "width:100%"></textarea><br>
	 	<label>Nhập price: </label>
	 	<input type = "text" name = "price"><br>
	 	<label>Nhập link image: </label>
	 	<input type = "file" name = "imageLink"><br> 
	 	<label for='category'>Category: </label> 
	 	<select name = "categoryID">
			<c:forEach items="${listcate}" var="item">
				<option value="${item.cateID}">${item.cateName}</option>
			</c:forEach>
		</select>
		<label>Nhập stoke: </label>
	 	<input type = "text" name = "stoke"><br>
		<input type = "submit" value = "Insert Product">
	</form>

</body>
</html>