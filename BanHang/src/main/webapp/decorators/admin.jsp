<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file = "/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td colspan = "2"><%@include file  = "/common/admin/header.jsp" %></td>
			<!-- Gop 2 cot thanh 1 trong bang -->
		</tr>
		<tr>
			<td><decorator:body></decorator:body></td>
			<td><%@ include file = "/common/admin/right.jsp" %>></td>	
		</tr>
		<tr>
			<td colspan = "2"><%@ include file = "/common/admin/footer.jsp" %>></td>
		</tr>
	</table>
</body>
</html>