<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Modify Product</h2>
<form action="<%=application.getContextPath()%>/modifyProduct" method="post">
<h3 style="display:none">Bike Id : <input type="text" name="id" value="${product.getId()}" style="display:none"/></h3>
<h3>Product Name : <input type="text" name="productName" value="${product.getProductName()}" /></h3>
<h3>Product Type : <input type="text" name="productType" value="${product.getProductType()}" /></h3>
<h3>Manufactured By : <input type="text" name="manufacturedBy" value="${product.getManufacturedBy()}" /></h3>
<h3>Price : <input type="text" name="price" value="${product.getPrice()}" /></h3>
<h3>Total Stock : <input type="number" name="stock" value="${product.getStock()}" /></h3>
<h3><input type="submit" value="SUBMIT"/></h3>
<hr>
<button><a href="getProducts">BACK</a></button>
</form>
</body>
</html>