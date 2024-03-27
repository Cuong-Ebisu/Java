<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.action-buttons {
	display: flex;
	align-items: center; /* Căn giữa theo chiều dọc */
	gap: 5px;
}

.action-buttons a {
	text-decoration: none;
	padding: 5px 10px;
	cursor: pointer;
	border: none;
	border-radius: 5px;
}

.action-buttons button.delete {
	background-color: #f44336; /* Màu đỏ cho nút Delete */
}
</style>

</head>
<body>
	<h2>List of Products</h2>
	<a href='<c:url value="/addProduct"/>'>Add product</a>
	<table border="1" style="width: 100%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Manufacturer</th>
				<th>Release Date</th>
				<th>Image</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.manufacturer}</td>
					<td>${product.releaseDate}</td>
					<td class="image-cell"><img
						src="${pageContext.request.contextPath}/uploads/${product.imagePath}"
						alt="Product Image" width="100px" height="100px"/></td>
					<td class="action-buttons">
						<!-- Nút Update -->
						<a href='<c:url value="/updateProduct">
							<c:param name="productId" value="${product.id}" />
						</c:url>'>Update</a>
						<!-- Nút Delete -->
						<a href='<c:url value="/deleteProduct">
							<c:param name="productId" value="${product.id}" />
						</c:url>' class="delete"
							onclick="return confirm('Are you sure?')">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>