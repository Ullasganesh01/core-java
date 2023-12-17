<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body bgcolor="aqua">
<h1>Thank You <%= request.getAttribute("firstName")%></h1>
<h1>Thank You {firstName}</h1>
</body>
</html>