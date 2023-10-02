<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head> 
<body>
<h1> Session Demo</h1>
<h3> Count: <c:out value="${count }"></c:out></h3>
<a href="/sessions/display"> Display session</a>
</body>
</html>