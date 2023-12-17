<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <header>
        <nav>
            <ul>
                <li>
                    <span id="xworkz">XWORKZ</span>
                </li>
                <li>
                    <a href="./index.jsp"><button>HOME</button></a>
                </li>
                <li>
                    <a href="./login.jsp"><button>Login Page</button></a>
                </li>
                <li>
                    <button type="button"><a href="./index.jsp">Back</a></button>
                </li>
                <li>
                    <a href="#" id="nxtpage"><button id="nextPage">Next Page</button></a>
                </li>
            </ul>
        </nav>
    </header>


    <!--<h1 id="success">User Registration Successfully</h1>-->
    <!--<h1> <%= request.getAttribute("successful") %> </h1>-->

    <div id="form-container">
        <h1>Registration Page</h1>
        <div id="form">
            <form action="userRegistration" method="post">
                <h3>Enter Name : <input type="text" name="name" id="name"></h3>
                <h3>Enter the age : <input type="number" name="age" id="age" min="1" max="100"></h3>
                <h3>Enter the Phone Number : <input type="number" name="pNumber" id="pNumber" min="1000000000" max="9999999999"></h3>
                <h3>Enter the User name : <input type="text" name="uName" id="uName"></h3>
                <h3>Enter the password : <input type="password" name="password" id="password"></h3>
                <div id="btns">
                    <h3><button type="submit" >SUBMIT</button> <button type="button"><a href="index.jsp">Back</a></button></h3>
                </div>
            </form>
        </div>
    </div>

    <div id="backend-messages">
        <h4> ${ register } </h4>
    </div>

</body>
</html>