<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <link rel="stylesheet" href="feedback.css">
  <title>XWorkz</title>
</head>
<body>
  <div class="nav">
    <ul>
      <li><a href="./index.jsp"><img src="./logo.png" height="25px" alt=""></a></li>
      <li><a href="./index.jsp">Home</a></li>
      <li> FEEDBACK </li>
    </ul>
  </div>

  <div class="form-container">
    <form action="feedbackForm" method="post" onsubmit="return validateForm()">
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
            <br><span id="comments-error" class="error">Hi</span>
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
          <li><a href="https://www.linkedin.com/in/ullas-ganesh"><img src="./linkedin logo.png" alt="" height="20px"></a></li>
          <li><a href="https://github.com/Ullasganesh01"><img src="./GitHub-logo.png" alt="" height="20px"></a></li>
        </div>
      </ul>
    </div>
  <script src="./feedback.js"></script>
</body>
</html>