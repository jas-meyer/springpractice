<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Current visit count</title>
</head>
<body>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h2>You have visited <a href ="/" >http://localhost:8080</a> 
 <c:out value="${thecount}"/>
 times
 </h2>
<h2><a href ="/">Test another visit?</a></h2>
<h2><a href ="/double"> +2 to count </a></h2>

<a href = "/reset"><button>Reset</button></a>

</body>
</html>