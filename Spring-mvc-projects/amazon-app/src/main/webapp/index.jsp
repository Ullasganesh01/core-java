<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Add Product</h2>
<form action="addProduct" method="post">
<h3>Product Name : <input type="text" name="productName" /></h3>
<h3>Product Type : <input type="text" name="productType" /></h3>
<h3>Manufactured By : <input type="text" name="manufacturedBy" /></h3>
<h3>Price : <input type="text" name="price" /></h3>
<h3>Total Stock : <input type="number" name="stock" /></h3>
<h3><input type="submit" value="SUBMIT" /></h3>
</form>
<hr>
<button><a href="getProducts">Get List Of Products</a></button>
<h3>${addedMessage}</h3>
</body>
</html>
