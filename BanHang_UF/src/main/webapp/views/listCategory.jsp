<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>

</head>
<body>
	
	<div>
		<span>
			<c:if test=" ${message !=null }">
				${message}		
			
			</c:if>
			
		</span>
	</div>
	
	<span><a href="<c:url value='/addcate'/>">Add Category</a></span>
	<table border="1" style="width:100%">
		<tr>
			<td>ID</td>
			<td>CateName</td>
			<td>icon</td>
			<td>Action</td>
		</tr>
		<c:forEach var="i" items="${list}">
		<tr>
			<td>${i.cateID}</td>
			<td><a href="<c:url value='/findprobycate?cateid=${i.cateID}'/>">${i.cateName}</a></td>
			<td>${i.image}</td>
			<td><a href="<c:url value='/update?id=${i.cateID}'/>">Update</a>|| <a href="<c:url value='/delete?id=${i.cateID}'/>">Delete</a></td>
		
		</tr>
		
		</c:forEach>
		
	</table>
	<a href="<c:url value='/countprobycate?'/>">Count Product By Category</a>

	
	
</body>
</html>