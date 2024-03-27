<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="admin-addCate" method ="post">		 
		<label> Input CategoryName: </label>
		<input type="text" name="categoryName"> 
		<label> Input CategoryCode: </label>
		<input type="text" name="categoryCode"> <br>
		<label> Input Images: </label>
		<input type="text" name="images"> 
		<label> Input Status: </label>
		<input type="text" name="status"> <br>	
		<input type="submit" value = "add Book">
	</form>
</body>
</html>