<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp"%>
<body>
	<section class="jumbotron text-center">
		<div class="container">
			<h1 class="jumbotron-heading">List Video</h1>
			<p class="lead text-muted mb-0">Admin List Video</p>
		</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="index.html">Home</a></li>
						<li class="breadcrumb-item"><a href="category.html">Category</a></li>
						<li class="breadcrumb-item active" aria-current="page">Sub-category</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-12 col-sm-3">
				<div class="card bg-light mb-3">
					<div class="card-header bg-primary text-white text-uppercase">
						<i class="fa fa-list"></i> Categories
					</div>
					<ul class="list-group category_block">
						<li class="list-group-item"><a href="#">Giải Trí</a></li>
					</ul>
				</div>
			</div>
			<div class="col">
				<div class="row">
					<c:forEach items="${listvideo}" var="video">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top"
								src="${video.poster}"
								alt="${video.title}" width=400 height=200>
							<div class="card-body">
								<h4 class="card-title">
									<a href="productdetail?pid=${video.videoId}" title="View Product">${video.title}</a>
								</h4>
								<p class="card-text">${video.description}</p>
							</div>
							<div class="row">
									<div class="col">
										<a href="<c:url value='/admin/video/edit?id=${video.videoId}'/>"class="btn btn-success btn-block">Edit</a>
									</div>
									<div class="col">
										<a href="<c:url value='/admin/video/delete?id=${video.videoId}'/>"class="btn btn-danger btn-block">Delete</a>
									</div>
								</div>
						</div>
					</div>
					</c:forEach>
					<div class="col-12">
						<nav aria-label="...">
							<ul class="pagination">
								<c:if test="${tag>1}">
									<li class="page-item">
										<a class="page-link" href="list?index=${tag-1}">Previous</a>
									</li>
								</c:if>
								<c:forEach begin="1" end="${endP}" var="i">
									<li class="page-item ${tag==i ? "active":""}"><a class="page-link " href="list?index=${i}">${i}</a></li>
								</c:forEach>
								<c:if test="${tag<endP}">
									<li class="page-item">
										<a class="page-link" href="list?index=${tag+1}">Next</a>
									</li>
								</c:if>
							</ul>
						</nav>
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- JS -->
	<script src="//code.jquery.com/jquery-3.2.1.slim.min.js"
		type="text/javascript"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		type="text/javascript"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		type="text/javascript"></script>
</body>
