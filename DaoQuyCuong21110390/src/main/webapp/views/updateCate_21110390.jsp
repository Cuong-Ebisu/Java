<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin-update?id=${oldCate.categoryId}" method ="post">	 
		<label> Input CategoryName: </label>
		<input type="text" name="categoryName" value = ${oldCate.categoryName }> 
		<label> Input CategoryCode: </label>
		<input type="text" name="categoryCode" value = ${oldCate.categoryCode }> <br>
		<label> Input Images: </label>
		<input type="text" name="images" value = ${oldCate.images }> 
		<label> Input Status: </label>
		<input type="text" name="status" value = ${oldCate.status }> <br>		
		<input type="submit" value = "update Cate">
	</form>
</body>
</html>