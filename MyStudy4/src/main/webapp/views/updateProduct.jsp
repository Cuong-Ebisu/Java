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

	<form action="updatePro" method="post">
		<label>Product ID: </label> 
		<input type="text" name="productID" value="${listcate.productID}" readonly ="readonly"> 
		<label>Nhập product name:</label>
		<input type="text" name="productName" value="${listcate.productName}">
		<label>Nhập description:</label> 
		<input type="text" name="description"value="${listcate.description }"> 
				
		<input type="submit" value="Update Product">
	</form>

</body>
</html>