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

	<div>
		<span> <c:if test="${message != null }">
				${message }
			</c:if>

		</span>
	</div>

	<span><a href="<c:url value = '/addcate' />">Add Category</a></span>
	<table border="1" style="width: 100px">
		<tr>
			<td>ID</td>
			<td>CateName</td>
			<td>Icon</td>
			<td>Action</td>
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.cateID }</td>
				<td><a href="<c:url value = '/findpro?cateid=${i.cateID }' />">${i.cateName }</a>
				</td>
				<td>${i.cateName }</td>
				<td>${i.images }</td>
				<td><a href="<c:url value = '/update?id=${i.cateID }' />">Update</a>
					|| <a href="<c:url value = '/delete?id=${i.cateID }' />">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<p>Danh sách sản phẩm bán nhiều nhất</p>
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
		<c:forEach var="i" items="${list2}">
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
				<td><a
					href="<c:url value = '/findpro?cateid=${i.categoryID }' />">Lấy danh sách</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>