<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order header list</title>
<style>.sunday{color:red}</style>
</head>
<body>
	<h1>検索結果</h1>
	
	<table border=5>
		<tr>
			<th>注文ID</th>
			<th>注文会員ID</th>
			<th>注文日時</th>
			<th>注文曜日</th>
		</tr>
		<c:forEach items="${orderHeaderList}" var="order" varStatus="index">
			<tr>
				<td><c:out value="${order.orderNo}"/></td>
				<td><c:out value="${order.memberId}"/></td>
				<td><fmt:formatDate pattern="yyyy年MM月dd日" value="${order.orderDatetime}"/></td>
				<fmt:formatDate var="dayofweek" pattern="E" value="${order.orderDatetime}"/>
				<td <c:if test="${dayofweek=='日'}">class="sunday"</c:if>>
					${dayofweek}
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>