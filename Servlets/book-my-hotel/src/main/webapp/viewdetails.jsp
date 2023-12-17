<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./css/style.css">
  <link rel="stylesheet" href="./css/feedback.css">
  <link rel="stylesheet" href="./css/bookresort.css">
  <title>XWorkz</title>
  <style>
    table {
      border-collapse: collapse;
      width: 100%;
    }
    
    th, td {
      text-align: left;
      padding: 8px;
    }
    
    tr:nth-child(even){background-color: #f2f2f2}
    
    th {
      background-color: #04AA6D;
      color: white;
    }

    #displaytable{
        width: 80vw;
        margin: auto;
    }
    </style>
</head>
<body>
  <div class="mynav">
    <ul class="horizontal">
      <li style="margin-left: 10px;"><a href="index.jsp" style="padding-bottom: 10px;"><img src="./images/xworkz-logo.png" width="40px" alt="" style="display: inline-block;"></a></li>
      <li><a href="index.jsp">Home</a></li>
      <li><a href="bookresort.jsp" id="book">Book</a></li>
      <li><a href="./viewdetails.jsp">View Details</a></li>
      <li style="height: 48px; margin-left: 25vw;text-align: center;"><a href="index.jsp" style="padding: 9px ;"><h2 id="title">RESORTS<h2></a></li>
      <li style="float:right; margin-right: 30px;"><a href="feedbackpage.jsp">Provide Feedback</a></li>
    </ul>
  </div>
  
  <div class="displaytable">
    <table>
        <tr>
            <th>SL.no</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Contact No</th>
            <th>Mode of Payment</th>
            <th>Check In Date</th>
            <th>Check Out Date :</th>
            <th>Adults</th>
            <th>Children</th>
            <th>Rooms</th>
        </tr>
        <c:forEach var="booking" items="${ bookings }">
            <tr>
                <td><c:out value="${booking.getId()}"  /></td>
                <td><c:out value="${booking.getFirstName()}" /></td>
                <td><c:out value="${booking.getLastName()}" /></td>
                <td><c:out value="${booking.getEmailId()}" /></td>
                <td><c:out value="${booking.getContactNo()}" /></td>
                <td><c:out value="${booking.getModeOfPayment()}" /></td>
                <td><c:out value="${booking.getCheckIn()}" /></td>
                <td><c:out value="${booking.getCheckOut()}" /></td>
                <td><c:out value="${booking.getNoOfAdults()}" /></td>
                <td><c:out value="${booking.getNoOfChild()}" /></td>
                <td><c:out value="${booking.getNoOfRooms()}" /></td>
            </tr>
        </c:forEach>
    </table>
  </div>

  <div class="footer" style="position: absolute;">
    <ul>
      <li>&copy; Ullas G, Software Developer</li>
      <li><span id="time"></span></li>
      <div class="links">
        <li><a href="https://www.linkedin.com/in/ullas-ganesh"><img src="./images/linkedin-icon.png" alt="" height="20px"></a></li>
        <li><a href="https://github.com/Ullasganesh01"><img src="./images/gitHub-icon.png" alt="" height="20px"></a></li>
        <li><a href="#"><img src="./images/instagram-icon.png" alt="" height="20px"></a></li>
      </div>
    </ul>
  </div>

  <script src="./js/index.js"></script>
  <script src="./js/bookresort.js"></script>
</body>
</html>