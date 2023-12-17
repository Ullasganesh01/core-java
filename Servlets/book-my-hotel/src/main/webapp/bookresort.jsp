<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./css/style.css">
  <link rel="stylesheet" href="./css/feedback.css">
  <link rel="stylesheet" href="./css/bookresort.css">
  <title>XWorkz</title>
</head>
<body>
  <div class="mynav">
    <ul class="horizontal">
      <li style="margin-left: 10px;"><a href="./index.jsp" style="padding-bottom: 10px;"><img src="./images/xworkz-logo.png"  width="40px" alt="" style="display: inline-block;"></a></li>
      <li><a href="./index.jsp">Home</a></li>
      <li><a href="./bookresort.jsp" id="book">Book</a></li>
      <li><a href="./viewdetails.jsp">View Details</a></li>
      <li style="height: 48px; margin-left: 25vw;text-align: center;"><a href="./index.jsp" style="padding: 9px ;"><h2  id="title">RESORTS<h2></a></li>
      <li style="float:right; margin-right: 30px;"><a href="./feedbackpage.jsp">Provide Feedback</a></li>
    </ul>
  </div>
  
  <div class="form-container">
    <form action="resortbookings" method="post" onsubmit="return validateForm()">
      <div style="text-align: center;"><h3><label>BOOK YOUR STAY</label></h3></div>
      <table>
        <tr >
          <td><h4><Label>First Name : </Label></h4></td>
          <td>
            <input type="text" id="name" name="name" onblur="validateName()"> 
            <br><span id="name-error" class="error"></span>
          </td>
        </tr>
        <tr >
            <td><h4><Label>Last Name : </Label></h4></td>
            <td>
              <input type="text" id="lname" name="lname" onblur="validateLastName()"> 
              <br><span id="lname-error" class="error"></span>
            </td>
          </tr>
        <tr>
          <td><h4><Label>Email : </Label></h4></td>
          <td>
            <input type="text" id="email" name="email" onblur="validateEmail()">
            <br><span id="email-error" class="error"></span>
          </td>
        </tr>
        <tr>
          <td><h4><Label>Contact No : </Label></h4></td>
          <td>
            <input type="text" id="contactno" name="contactno"  onblur="validateContactNo()">
            <br><span id="contact-error" class="error"></span>
          </td>
        </tr>
        <tr>
            <td><h4><Label>Mode of Payment : </Label></h4></td>
            <td><select name="payMode" id="payMode" required>
                    <option value>----select----</option>
                    <option value="gpay">GPAY</option>
                    <option value="phonepe">PhonePe</option>
                    <option value="paytm">PayTm</option>
                    <option value="card">Debit/Credit Card</option>
                    <option value="cash">Cash</option>
                </select>
                <br><span id="payment-error" class="error"></span>
            </td>
        </tr>
        <tr>
            <td><h4><Label>Check In Date : </Label></h4></td>
            <td>
              <input type="date" id="checkin" name="checkin"  required>
              <br><span id="checkin-error" class="error"></span>
            </td>
        </tr>
        <tr>
            <td><h4><Label>Check Out Date : </Label></h4></td>
            <td>
              <input type="date" id="checkout" name="checkout"  required>
              <br><span id="checkout-error" class="error"></span>
            </td>
        </tr>
        <tr>
            <td><h4><Label>Adults : </Label></h4></td>
            <td>
              <input type="number" id="adults" name="adults"  style="width: 120px;" onblur="validateAdults()">
              <br><span id="adults-error" class="error"></span>
            </td>
        </tr>
        <tr>
            <td><h4><Label>Childrens : </Label></h4></td>
            <td>
              <input type="number" id="childrens" name="childrens"  style="width: 120px;">
              <br><span id="childrens-error" class="error"></span>
            </td>
        </tr>
        <tr>
            <td><h4><Label>Rooms : </Label></h4></td>
            <td>
              <input type="number" id="rooms" name="rooms" style="width: 120px;" onblur="validateRooms()">
              <br><span id="rooms-error" class="error"></span>
            </td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center;"><input type="submit" value="SUBMIT" style="margin-right: 20px;" class="btn"><input type="reset" value="CLEAR" class="btn"></td>
        </tr>
      </table>
    </form>
  </div>

  <div class="footer" style="position: relative;">
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