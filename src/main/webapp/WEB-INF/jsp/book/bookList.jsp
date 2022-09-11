<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book list</title>
<style>.expensivebook{color:red}</style>
</head>
<body>
	<h1>検索結果</h1>
	
	<table border=5>
		<tr>
			<th>ID</th>
			<th>名称</th>
			<th>値段</th>
			<th>ページ数</th>
		</tr>
		<c:forEach items="${bookList}" var="book" varStatus="index">
			<tr>
				<td><c:out value="${book.bookId}"/></td>
				<td><c:out value="${book.bookName}"/></td>
				<td 
					<c:if test="${book.price>2000}">class="expensivebook"</c:if>>
					<fmt:formatNumber pattern="#,###" value="${book.price}"/>
				</td>
				<td><c:out value="${book.pageCount}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>