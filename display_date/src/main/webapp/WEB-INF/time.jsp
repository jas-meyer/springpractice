<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/time.css">
	<script type ="text/javascript" src="js/time.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The Time</title>
</head>
<body>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1> <c:out value="${rightnow}"/> </h1>
</body>
</html>