<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2> List Of Products </h2>
<table>
<tr>
<td>Sl No</td>
<td>Product Name</td>
<td>Product Type</td>
<td>Manufactured By</td>
<td>Price</td>
<td>Total Stock</td>
<td colspan="2">ACTION</td>
</tr>
<c:forEach items="${products}" var="product">
<tr>
<td>${product.getId()}</td>
<td>${product.getProductName()}</td>
<td>${product.getProductType()}</td>
<td>${product.getManufacturedBy()}</td>
<td>${product.getPrice()}</td>
<td>${product.getStock()}</td>
<td><button><a href="getAndModify/${product.getId()}">Modify</a></button></td>
<td><button><a href="remove?productId=${product.getId()}">Remove</a></button></td>
</tr>
</c:forEach>
</table>
<button><a href="index.jsp">BACK</a></button>
<h3>${modifyMessage}</h3>
<h3>${removeProductMessage}</h3>
</body>
</html>