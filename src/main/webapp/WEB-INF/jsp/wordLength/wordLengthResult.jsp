<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page for wordLength</title>
</head>
<body>
	文字列<c:out value="${param.string}"/>の長さは
	${result}です。
</body>
</html>