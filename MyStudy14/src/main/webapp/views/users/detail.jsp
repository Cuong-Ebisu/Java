<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<table border="1" style="width: 100px">
	<tr>
		<td></td>
		<td></td>			
	</tr>
		<tr>
			<td>
			${i.cover_image}
			</td>
			<td>
			<a href='<c:url value = "/detail?id=${i.bookid}"/>'>Tiêu đề: ${i.title }</a> <br>		
			<br>
			Mã isbn: ${i.isbn }
			<br>
			Tác giả: 
			<c:forEach var="j" items="${i.authors}" varStatus="loop">
				${j.author_name }
				<c:if test="${!loop.last}">, </c:if>
			</c:forEach>
			<br>
			Publisher: ${i.publisher }
			<br>
			Publisher_date: ${i.publish_date }
			<br>
			Quantity: ${i.quantity }
			<br>
			Review: 
			<c:forEach var="j" items="${i.ratings}" varStatus="loop">
				${j.review_text }
				<c:if test="${!loop.last}">, </c:if>
			</c:forEach>
			</td>	
		</tr>	
		
		<tr>
		<td>
		Reviews
		</td>
		</tr>
		
</table>
