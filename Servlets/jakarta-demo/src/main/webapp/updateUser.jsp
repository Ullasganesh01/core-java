<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
                    <a href="./registration.jsp"><button>User Registration</button></a>
                </li>
                <li>
                    <a href="./login.jsp"><button>Login Page</button></a>
                </li>
                <li>
                     <button type="button"><a href="./userpage.jsp">Back</a></button>
                 </li>
                <li>
                    <a href="#" id="nxtpage"><button id="nextPage">Next Page</button></a>
                </li>
            </ul>
        </nav>
    </header>

    <div id="form-container">
    <h1>Update User Page</h1>
    <div id="form">
        <form action="updateUser" method="post">
            <h3 style="display : none"><input type="text" name="id" id="id" value="${user.getId()}" style="display : none"></h3>
            <h3>Enter Name : <input type="text" name="name" id="name" value="${user.getName()}" ></h3>
            <h3>Enter the age : <input type="number" name="age" id="age" min="1" max="100" value="${user.getAge()}"></h3>
            <h3>Enter the Phone Number : <input type="number" name="pNumber" id="pNumber" min="1000000000" max="9999999999" value="${user.getPNumber()}"></h3>
            <h3>Enter the User name : <input type="text" name="uName" id="uName" value="${user.getUName()}"></h3>
            <h3>Enter the password : <input type="password" name="password" id="password" value="${user.getPassword()}"></h3>
            <div id="btns">
                <h3><button type="submit">UPDATE</button> <button type="button"><a href="index.jsp">Back</a></button></h3>
            </div>
        </form>
    </div>
    </div>
</body>
</html>