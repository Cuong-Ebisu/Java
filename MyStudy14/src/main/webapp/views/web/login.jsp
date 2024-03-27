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
					<div class="alert alert-danger">${error }</div>
				</c:if>
			</div>

		</div>
		<div class="row">
			<div class="col-sm-12">
				<form action="login" method="post">
					<div class="form-group">
						<label for="email">Email: </label> <input type="text" class="form-controL" id="email" name="email">
					</div>

					<div class="form-group">
						<label for="passwd">Password: </label> <input type="password" class="form-controL" id="passwd" name="passwd">
					</div>
					<div class="form-check">
				        <input type="checkbox" class="form-check-input" id="remember" name="remember">
				        <label class="form-check-label" for="remember">Remember Me</label>
				    </div>
					<button type="submit" class="btn btn-primary">Login</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>