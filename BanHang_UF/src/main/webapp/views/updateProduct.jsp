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

	<form action="update" method="post">
		<label>Product ID: </label> 
		<input type="text" name="productID" value="${pro.productID}" readonly ="readonly"> 
		<label>Nhập product name:</label>
		<input type="text" name="productName" value="${pro.productName}">
		<label>Nhập description:</label> 
		<input type="text" name="description"value="${pro.description }"> 
		<label>Nhập price:</label> 
		<input type="text" name="price"value="${pro.price }"> 
		<label>Nhập imageLink:</label> 
		<input type="text" name="imageLink"value="${pro.imageLink }"> 
		<label>Nhập categoryID:</label> 
		<input type="text" name="categoryID"value="${pro.categoryID }"readonly ="readonly"> 
		<label>Nhập sellerID:</label> 
		<input type="text" name="sellerID"value="${pro.sellerID }"readonly ="readonly"> 
		<label>Nhập amount:</label> 
		<input type="text" name="amount"value="${pro.amount }"> 
		<label>Nhập stoke:</label> 
		<input type="text" name="stoke"value="${pro.stoke }"> 
		
		<input type="submit" value="Update Product">
	</form>

</body>
</html>