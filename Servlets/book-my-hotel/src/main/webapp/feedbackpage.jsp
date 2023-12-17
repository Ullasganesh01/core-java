<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./css/style.css">
  <link rel="stylesheet" href="./css/feedback.css">
  <title>XWorkz</title>
</head>
<body>
  <div class="mynav">
    <ul class="horizontal">
      <li style="margin-left: 10px;"><a href="./index.jsp" style="padding-bottom: 10px;"><img src="./images/xworkz-logo.png"  width="40px" alt="" style="display: inline-block;"></a></li>
      <li><a href="./index.jsp">Home</a></li>
      <li><a href="bookresort.jsp" id="book">Book</a></li>
      <li><a href="./viewdetails.jsp">View Details</a></li>
      <li style="height: 48px; margin-left: 25vw;text-align: center;"><a href="./index.jsp" style="padding: 9px ;"><h2  id="title">RESORTS<h2></a></li>
      <li style="float:right; margin-right: 30px;"><a href="./feedbackpage.jsp">Provide Feedback</a></li>
    </ul>
  </div>
  
  <div class="form-container">
    <form action="feedbackForm" method="post" onsubmit="return validateForm()">
      <div style="text-align: center;"><h3><label>FEEDBACK</label></h3></div>
      <table>
        <tr >
          <td><h4><Label>Name : </Label></h4></td>
          <td>
            <input type="text" id="name" name="name" onblur="validateName()"> 
            <br><span id="name-error" class="error"></span>
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
          <td><h4><Label>Comments  : </Label></h4></td>
          <td>
            <textarea name="comments" id="comments" cols="18" rows="3" onblur="validateComments()"></textarea>
            <br><span id="comments-error" class="error"></span>
          </td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center;"><input type="submit" value="SUBMIT" style="margin-right: 20px;" class="btn"><input type="reset" value="CLEAR" class="btn"></td>
        </tr>
      </table>
    </form>
  </div>

  <div class="footer">
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
  <script src="./js/feedback.js"></script>
</body>
</html>