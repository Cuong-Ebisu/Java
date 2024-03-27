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
	<form action="admin-updateBook?id=${oldBook.bookid}" method ="post">	 
		<label> Input Book isbn: </label>
		<input type="text" name="bookIsbn" value = ${oldBook.isbn }> <br>
		<label> Input Book title: </label>
		<input type="text" name="bookTitle" value = ${oldBook.title }> 
		<label> Input Book publisher: </label>
		<input type="text" name="bookPublisher" value = ${oldBook.publisher }> <br>
		<label> Input Book price: </label>
		<input type="text" name="bookPrice" value = ${oldBook.price }> 
		<label> Input Book description: </label>
		<input type="text" name="bookDescription" value = ${oldBook.description }> <br>
		<label> Input Book publish_date: </label>
		<input type="text" name="bookPublish_date" value = ${oldBook.publish_date }> 
		<label> Input Book cover_image: </label>
		<input type="text" name="bookCover_image" value = ${oldBook.cover_image }> <br>
		<label> Input Book quantity: </label>
		<input type="text" name="bookQuantity" value = ${oldBook.quantity }>		
		<input type="submit" value = "update Book">
	</form>
</body>
</html>