<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Secret Code</title>
</head>
<body>
<div id = "form">

<h3>Who is the best soccer/football player?</h3>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h3><c:out value ="${error}"/></h3>
<form method="POST" action="/answer">
<input type="text" name = "player">
<button>Answer!</button>
</form>
</div>
</body>
</html>