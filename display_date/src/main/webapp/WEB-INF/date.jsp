<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/date.css">
	<script type ="text/javascript" src="js/date.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Today's Date</title>
</head>
<body>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1> <c:out value="${todays}"/> </h1>

<h2><a href ="/">Home</a></h2>
</body>
</html>