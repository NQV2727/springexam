<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result for order header search</title>
</head>
<body>
	<h1>ID:<c:out value="${param.orderId}"/>の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd><c:out value="${orderHeader.orderNo}"/></dd>
		<dt>注文したメンバーID</dt>
		<dd><c:out value="${orderHeader.memberId}"/></dd>
		<dt>注文日時</dt>
		<dd><fmt:formatDate pattern="yyyy年MM月dd日" value="${orderHeader.orderDatetime}"/></dd>
	</dl>
</body>
</html>