<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>.error{color:red}</style>
<title>Input for infrastructure insert</title>
</head>
<body>
	<h1>インフラを追加</h1>
	<form:form action="confirm" modelAttribute="infraForm">	
		<dl> 
			<dt>ID</dt>
			<dd>
				<form:errors path="id" element="p" cssClass="error"/>
				<form:input path="id"/>
			</dd>
			<dt>インフラ名</dt>
			<dd>
				<form:errors path="name" element="p" cssClass="error"/>
				<form:input path="name"/>
			</dd>
			<dt>登録日</dt>
			<dd>
				<form:errors path="date" element="p" cssClass="error"/>
				<form:input path="date"/>
			</dd>
		</dl>
		<input type="submit" value="追加"/>
	</form:form>
</body>
</html>