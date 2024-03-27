<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<section class="row">
	<div class="col mt-4">
		<div class="card">
			<div class="card-header">List Product</div>
			<div class="card-body">
				<!-- Hiển thông báo -->
				<c:if test="${message != null}">
					<div class="alert alert-primary" role="alert">
						<i>${message}</i>
					</div>
				</c:if>
				<!-- Hêt thông báo -->
				<a href="/admin/products/add">Add Product</a>
				<table class="table table-striped table-responsive">
					<thead class="thead-inverse">
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
						<c:forEach items="${products}" var="product">
							<tr>
								<td scope="row">${product.id}</td>
								<td>${product.name}</td>
								<td>${product.description}</td>
								<td>${product.price}</td>
								<td>${product.quantity}</td>
								<td>${product.manufacturer}</td>
								<td>${product.releaseDate}</td>
								<td>${product.imagePath}</td>
								<td><a href="/admin/categories/view/${product.id}"
									class="btn btn-outline-info"><i class="fa fa-info"></i></a> <a
									href="/admin/categories/edit/${product.id}"
									class="btn btn-outline-warning"><i class="fa fa-edit"></i></a>
									<a href="/admin/categories/delete/${product.id}"
									class="btn btn-outline-danger"><i class="fa fa-trash"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="card-footer text-muted">
				<nav aria-label="...">
					<ul class="pagination">
						<li class="page-item disabled"><span class="page-link">Previous</span>
						</li>
						<li class="page-item"><a class="page-link" href="#">1</a></li>
						<li class="page-item active" aria-current="page"><span
							class="page-link">2</span></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">Next</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</section>

