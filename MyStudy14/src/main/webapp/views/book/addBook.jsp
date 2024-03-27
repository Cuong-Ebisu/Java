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
	<form action="admin-addBook" method ="post">		 
		<label> Input Book isbn: </label>
		<input type="text" name="bookIsbn"> <br>
		<label> Input Book title: </label>
		<input type="text" name="bookTitle"> 
		<label> Input Book publisher: </label>
		<input type="text" name="bookPublisher"> <br>
		<label> Input Book price: </label>
		<input type="text" name="bookPrice"> 
		<label> Input Book description: </label>
		<input type="text" name="bookDescription"> <br>
		<label> Input Book publish_date: </label>
		<input type="text" name="bookPublish_date"> 
		<label> Input Book cover_image: </label>
		<input type="text" name="bookCover_image"> <br>
		<label> Input Book quantity: </label>
		<input type="text" name="bookQuantity">		
		<input type="submit" value = "add Book">
	</form>
</body>
</html>