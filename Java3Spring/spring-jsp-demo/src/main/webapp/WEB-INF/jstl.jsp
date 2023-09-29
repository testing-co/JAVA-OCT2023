<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<div class="container mt-5">
	<h1>JSTL demo</h1>
	<p>
		Name:
		<c:out value="${jspName }"></c:out>
	</p>
	<p>Happiness ${happiness }</p>
	<p>
		Hungry?
		<c:out value="${isHungry }"></c:out>
	</p>
	<h2>if-statement</h2>
	<c:if test="${happiness>5}">
		<p>I am happy</p>
	</c:if>

	<h2>if-else statement</h2>
	<c:choose>
		<c:when test="${isHungry == true}">
			<p>I am hungry</p>
		</c:when>
		<c:otherwise>
			<p>I am not hungry</p>
		</c:otherwise>
	</c:choose>

	<h2>for-each</h2>
	<ul>
	<c:forEach var="eachSkill" items="${skills}">
		<li> <c:out value="${eachSkill}"/> </li>
	</c:forEach>
	</ul>
	</div>
</body>
</html>










