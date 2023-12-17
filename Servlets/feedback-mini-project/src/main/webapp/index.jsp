<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>XWorkz</title>
</head>
<body>
  <div class="nav">
    <ul>
      <li><a href="./index.jsp"><img src="./logo.png" height="25px" alt=""></a></li>
      <li><a href="./index.jsp">Home</a></li>
      <li><a href="./feedbackpage.jsp">Feedback</a></li>
      <li>FEEDBACK FORM</li>
      <div class="search">
        <form action="">
          <li><input id="search-engine" type="search" placeholder="Search" aria-label="Search"></li>
          <li><button class="active" type="submit">Search</button></li>
        </form>
      </div>
    </ul>
  </div>

  <div> <h3> ${ feedbackSubmitted } </h3> </div>

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
  <script src="./index.js"></script>
</body>
</html>