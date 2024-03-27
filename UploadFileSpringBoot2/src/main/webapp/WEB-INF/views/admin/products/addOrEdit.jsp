<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<section class="row">
	<div class="col-6 offset-3 mt-4">
		<form action="<c:url value="/admin/products/saveOrUpdate" />"
			method="POST">
			<div class="card">
				<div class="card-header">
					<h2>${product.isEdit ? 'Edit Product' :'Add New Product'}</h2>
				</div>
				<div class="card-body">
					<div class="mb-3">
						<label for="id" class="form-label">Product ID:</label> <input
							type="hidden" value="${product.isEdit}"> <input
							type="text" readonly="readonly" class="form-control"
							value="${product.id}" id="id" name="id"
							aria-describedby="productIdid" placeholder="Product Id">
					</div>
					<div class="mb-3">
						<label for="productname" class="form-label">Product
							Name:</label> <input type="text" class="form-control"
							value="${product.name}" id="name"
							name="name" aria-describedby="nameid"
							placeholder="Product Name">
					</div>
					<div class="mb-3">
						<label for="productdescription" class="form-label">Product
							Description:</label> <input type="text" class="form-control"
							value="${product.description}" id="description"
							name="description" aria-describedby="descriptionid"
							placeholder="Product Description">
					</div>
					<div class="mb-3">
						<label for="productprice" class="form-label">Product
							Price:</label> <input type="text" class="form-control"
							value="${product.price}" id="price"
							name="price" aria-describedby="priceid"
							placeholder="Product Price">
					</div>
					<div class="mb-3">
						<label for="productquantity" class="form-label">Product
							Quantity:</label> <input type="text" class="form-control"
							value="${product.quantity}" id="quantity"
							name="quantity" aria-describedby="quantityid"
							placeholder="Product Quantity">
					</div>
					<div class="mb-3">
						<label for="productmanufacturer" class="form-label">Product
							Manufacturer:</label> <input type="text" class="form-control"
							value="${product.manufacturer}" id="manufacturer"
							name="manufacturer" aria-describedby="manufacturerid"
							placeholder="Product Manufacturer">
					</div>
					<div class="mb-3">
						<label for="productreleaseDate" class="form-label">Product
							ReleaseDate:</label> <input type="text" class="form-control"
							value="${product.releaseDate}" id="releaseDate"
							name="releaseDate" aria-describedby="releaseDateid"
							placeholder="Product ReleaseDate">
					</div>
					<div class="mb-3">
						<label for="productimagePath" class="form-label">Product
							ImagePath:</label> <input type="text" class="form-control"
							value="${product.imagePath}" id="imagePath"
							name="imagePath" aria-describedby="imagePathid"
							placeholder="Product ImagePath">
					</div>
				</div>
			</div>
			<div class="card-footer text-muted">
				<a href="<c:url value="/admin/products/add"/>"
					class="btn btn-secondary"><i class="fas fa-new"></i> New</a> 
					<a href="<c:url value="/admin/products" />" class="btn btn-success"><i
					class="fas fa-bars"></i> List Products</a>
				<button class="btn btn-primary" type="submit">
					<i class="fas fa-save"></i>
					<c:if test="${product.isEdit}">
						<span>Update</span>
					</c:if>
					<c:if test="${!product.isEdit}">
						<span>Save</span>
					</c:if>
				</button>
			</div>
		</form>
	</div>
</section>