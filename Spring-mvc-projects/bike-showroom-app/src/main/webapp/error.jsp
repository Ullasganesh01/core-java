<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach items="${ errors }" var="error">
<li>${error.getDefaultMessage()}</li>
</c:forEach>
<h3>${getBikesError}</h3>
<h3>${getAndModifyError}</h3>
<h3>${removeBikeError}</h3>
<button><a href="index.jsp">BACK</a></button>
</body>
</html>