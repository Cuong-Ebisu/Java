<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" style="width: 100%">
		<tr>
			<td>ProductID</td>
			<td>ProductName</td>
			<td>Description</td>
			<td>Price</td>
			<td>imageLink</td>
			<td>CategoryID</td>
			<td>SellerID</td>
			<td>Amount</td>
			<td>stoke</td>
		</tr>
		<c:forEach var="i" items="${listpro}">
			<tr>
				<td>${i.productID }</td>
				<td>${i.productName }</td>
				<td>${i.description }</td>
				<td>${i.price }</td>
				<td>${i.imageLink }</td>
				<td>${i.categoryID }</td>
				<td>${i.sellerID }</td>
				<td>${i.amount }</td>
				<td>${i.stoke }</td>
				
				<td>
				<td>
					<a href = "<c:url value = '/product/update?id=${i.productID }' />">Update</a> ||
				 	<a href = "<c:url value = '/product/delete?id=${i.productID }' />">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>