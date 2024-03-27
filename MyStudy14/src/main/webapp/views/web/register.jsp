<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<c:if test="${not empty message}">
					<div class="alert alert-success">${message}</div>
				</c:if>
				<c:if test="${not empty error}">
					<div class="alert alert-danger">${error}</div>
				</c:if>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<form action="register" method="post">
						
						<div class="form-group">
							<label for="email">Email: </label> <input type="text" class="form-controL”" id="email" name="email">
						</div>
						<div class="form-group">
							<label for="fulLname">Full Name: </label> <input type="text" class="form-controL" id="fullname" name="fullname">
						</div>
						<div class="form-group">
							<label for="passws">Password: </label> <input type="password" class="form-controL" id="passws" name="passws">
						</div>						
						<button type="submit" class="btn btn-primary">Register</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>