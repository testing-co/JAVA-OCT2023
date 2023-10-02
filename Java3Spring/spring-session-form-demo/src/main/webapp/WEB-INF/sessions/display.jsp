<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring demo</title>
</head>
<body>
<h1> Session display</h1>
<h3> Count: <c:out value="${count }"></c:out></h3>
<a href="/sessions/home"> Back to home</a>
</body>
</html>