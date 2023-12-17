<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <style>
        #form{
            width: max-content;
            height: 25vh;
        }
    </style>
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
                    <a href="./registration.jsp"><button>User Registration</button></a>
                </li>
               <!-- <li>
                    <a href="getUsers"><button>Get All Users</button></a>
                </li>-->
                <li>
                    <button type="button"><a href="./index.jsp">Back</a></button>
                </li>
                <li>
                    <a href="#" id="nxtpage"><button id="nextPage">Next Page</button></a>
                </li>
            </ul>
        </nav>
    </header>

    <div id="form-container">
    <h1> Login Page </h1>
    <div id="form">
        <form action="loginUser" method="get">
            <h3>Enter the User name : <input type="text" name="uName" id="uName"></h3>
            <h3>Enter the password : <input type="password" name="password" id="password"></h3>
            <div id="btns">
                <h3><button type="submit">SUBMIT</button> <button type="button"><a href="index.jsp">Back</a></button></h3>
            </div>
        </form>
    </div>
</div>

<div id="backend-messages">
    <h4> ${ register } </h4>
    <h4> ${ message } </h4>
</div>

</body>
</html>