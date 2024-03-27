<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.table{
	border: 1px;
	border-color: solid black;
	background-color: gray;
	}
</style>
</head>
<body>
	<table class = "table">
		<tr>
			<td colspan="2"><%@include file="/common/manager/header.jsp"%></td>
			<!-- Gop 2 cot thanh 1 trong bang -->
		</tr>
		<tr>
			<td><%@ include file="/common/manager/left.jsp"%>></td>
			<td><decorator:body></decorator:body></td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="/common/manager/footer.jsp"%>></td>
		</tr>
	</table>
</body>
</html>