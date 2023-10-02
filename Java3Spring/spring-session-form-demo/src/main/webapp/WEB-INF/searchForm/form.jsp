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
	<h1> Search Form (GET METHOD)</h1>
	<form action="/search/display" method="GET">
	<p>Search for....
	<input type="text" name="keyword" />
	<button type="submit">Search!</button>
	</p>
	</form>
</body>
</html>