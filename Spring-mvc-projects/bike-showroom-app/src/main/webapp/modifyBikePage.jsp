<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Modify Bike</h2>
<form action="modifyBike" method="post">
<h3 style="display:none">Bike Id : <input type="text" name="id" value="${bike.getId()}" style="display:none"/></h3>
<h3>Bike Name : <input type="text" name="bikeName" value="${bike.getBikeName()}"/></h3>
<h3>Engine(cc) : <input type="text" name="engineCC" value="${bike.getEngineCC()}"/></h3>
<h3>Color : <input type="text" name="color" value="${bike.getColor()}"/></h3>
<h3>Bike Type : <input type="text" name="bikeType" value="${bike.getBikeType()}"/></h3>
<h3>Manufacture/Producer Company : <input type="text" name="company" value="${bike.getCompany()}"/></h3>
<h3>No Of Gears : <input type="number" name="gears" value="${bike.getGears()}"/></h3>
<h3>Ex-Showroom Price : <input type="text" name="exShowroomPrice" value="${bike.getExShowroomPrice()}"/></h3>
<h3><input type="submit" value="SUBMIT"/></h3>
<hr>
<button><a href="getBikes">BACK</a></button>
</form>
</body>
</html>