<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach items="${errors}" var="error">
<li>${error.getDefaultMessage()}</li>
</c:forEach>
<h3>${addProductError}</h3>
</body>
</html>