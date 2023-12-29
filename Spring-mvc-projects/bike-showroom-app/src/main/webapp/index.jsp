<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Add Bike</h2>
<form action="addBike" method="post">
<h3>Bike Name : <input type="text" name="bikeName"/></h3>
<h3>Engine(cc) : <input type="text" name="engineCC"/></h3>
<h3>Color : <input type="text" name="color"/></h3>
<h3>Bike Type : <input type="text" name="bikeType"/></h3>
<h3>Manufacture/Producer Company : <input type="text" name="company"/></h3>
<h3>No Of Gears : <input type="number" name="gears"/></h3>
<h3>Ex-Showroom Price : <input type="text" name="exShowroomPrice"/></h3>
<h3><input type="submit" value="SUBMIT"/></h3>
</form>
<hr>
<button><a href="getBikes">Get List Of Bikes</a></button>
<h3>${addedMessage}</h3>
</body>
</html>
