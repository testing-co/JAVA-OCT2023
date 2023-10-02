<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form demo</title>
</head>
<body>
	<h1> Search DISPLAY (GET METHOD)</h1>
	<h3> You searched for <c:out value="${keyword }"></c:out></h3>
</body>
</html>