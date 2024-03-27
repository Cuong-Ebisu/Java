<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


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
	
	
	
</body>
</html>