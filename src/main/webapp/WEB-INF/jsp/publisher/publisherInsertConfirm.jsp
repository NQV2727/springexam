<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm for publisher insert</title>
</head>
<body>
	<h1>出版社を追加</h1>
	<dl>
		<dt>ID</dt>
		<dd>
			<c:out value="${publisherForm.id}"/>
		</dd>
		<dt>出版社名</dt>
		<dd>
			<c:out value="${publisherForm.name}"/>
		</dd>
		<dt>都道府県</dt>
		<dd>
			<c:out value="${publisherForm.prefecture}"/>
		</dd>
	</dl>
	<form:form modelAttribute="publisherForm" action="input">
		<form:hidden path="id"/>
		<form:hidden path="name"/>
		<form:hidden path="prefecture"/>
		<input type="submit" value="戻る"/>
	</form:form>
</body>
</html>