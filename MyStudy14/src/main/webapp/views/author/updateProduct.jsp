<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin-updatePro?id=${oldPro.productID}" method ="post" enctype="multipart/form-data">
 		<label>Nhập product name: </label>
	 	<input type = "text" name = "productName" value = ${oldPro.productName }><br>
	 	<label >Nhập desc: </label>
	 	<textarea name = "description" cols = "5" class = "form-control" style = "width:100%" value = ${oldPro.description }></textarea><br>
	 	<label>Nhập price: </label>
	 	<input type = "text" name = "price" value = ${oldPro.price }><br>
	 	<label>Nhập link image: </label>
	 	<input type = "file" name = "imageLink" value = ${oldPro.imageLink }><br> 
	 	<label for='category'>Category: </label> 
	 	<select name = "categoryID">
			<c:forEach items="${listcate}" var="item">
				<option value="${item.cateID}">${item.cateName}</option>
			</c:forEach>
		</select>
		<label>Nhập stoke: </label>
	 	<input type = "text" name = "stoke" value = ${oldPro.stoke }><br>
		<input type = "submit" value = "Update Product">
	</form>
</body>
</html>