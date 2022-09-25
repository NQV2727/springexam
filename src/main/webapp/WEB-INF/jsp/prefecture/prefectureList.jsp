<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>prefecture list</title>
<style>.bigcity{color:red}</style>
</head>
<body>
	<h1>検索結果</h1>
	
	<table border=3>
		<tr>
			<th>No</th>
			<th>都道府県名</th>
			<th>人口</th>
			<th>3地方区分</th>
			<th>8地方区分</th>		
		</tr>
		<c:forEach items="${prefectureList}" var="prefecture" varStatus="index">
			<tr>
				<td>${index.count}</td>
				<td><c:out value="${prefecture.name}"/></td>
				<td 
					<c:if test="${prefecture.population>2000000}">class="bigcity"</c:if>>
					<fmt:formatNumber pattern="#,###" value="${prefecture.population }"/>
				</td>
				<td><c:out value="${prefecture.section3Id}"/></td>
				<td><c:out value="${prefecture.section8Id}"/></td>	
			</tr>
		</c:forEach>
		<c:forEach items="${prefectures}" var="prefecture" varStatus="index">
			<tr>
				<td>${index.count}</td>
				<td><c:out value="${prefecture.name}"/></td>
				<td 
					<c:if test="${prefecture.population>2000000}">class="bigcity"</c:if>>
					<fmt:formatNumber pattern="#,###" value="${prefecture.population }"/>
				</td>
				<td><c:out value="${prefecture.section3Id}"/></td>
				<td><c:out value="${prefecture.section8Id}"/></td>	
			</tr>
		</c:forEach>
	</table>
</body>
</html>