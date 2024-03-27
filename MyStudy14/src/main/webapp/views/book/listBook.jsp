<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<span> <a href ="<c:url value = '/admin-addBook'/>"> Add Book</a></span>
	<table id="example" class="table table-striped table-bordered" style="width:100%">
	<thead>
		<tr> 
			<td>Book ID</td>
			<td>ISBN</td>
			<td>Title</td>
			<td>Publisher</td>
			<td>Price</td>
			<td>Description</td>
			<td>Publish_date</td>
			<td>Cover_image</td>
			<td>Quantity</td>
			<td></td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var ="i" items = "${list}">
		<tr>
			<td>${i.bookid}</td>
			<td>${i.isbn}</td>
			<td>${i.title}</td>
			<td>${i.publisher}</td>
			<td>${i.price}</td>
			<td>${i.description}</td>
			<td>${i.publish_date}</td>
			<td>${i.cover_image}</td>
			<td>${i.quantity}</td>
			<td>
			<a href ="<c:url value ='/admin-updateBook?id=${i.bookid}'/>">Update</a>
			<a href ="<c:url value ='/admin-deleteBook?id=${i.bookid}'/>">Delete</a>
			</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>