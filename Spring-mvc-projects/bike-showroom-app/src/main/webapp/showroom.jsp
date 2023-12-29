<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2> List Of Bikes </h2>
<table>
<tr>
<td>Sl No</td>
<td>Bike Name</td>
<td>Engine(cc)</td>
<td>Color</td>
<td>Bike Type</td>
<td>Company</td>
<td>No Of Gears</td>
<td>Ex-Showroom Price</td>
<td colspan="2">ACTION</td>
</tr>
<c:forEach items="${bikes}" var="bike">
<tr>
<td>${bike.getId()}</td>
<td>${bike.getBikeName()}</td>
<td>${bike.getEngineCC()}</td>
<td>${bike.getColor()}</td>
<td>${bike.getBikeType()}</td>
<td>${bike.getCompany()}</td>
<td>${bike.getGears()}</td>
<td>${bike.getExShowroomPrice()}</td>
<td><button><a href="getAndModify?bikeId=${bike.getId()}">Modify</a></button></td>
<td><button><a href="remove?bikeId=${bike.getId()}">Remove</a></button></td>
</tr>
</c:forEach>
</table>
<button><a href="index.jsp">BACK</a></button>
</body>
</html>