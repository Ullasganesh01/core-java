<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html lang="en">

        <head>
            <meta charset="ISO-8859-1" />
            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
            <title>Document</title>
            <link rel="stylesheet" href="./resources/css/login.css" />
            <style>
                #form {
                    width: max-content;
                    height: 25vh;
                }
            </style>
        </head>

        <body>
            <div id="form-container">
                <h1>Login Page</h1>
                <div id="form">
                    <form action="loginUser" method="post">
                        <h3>
                            Enter the Login ID :
                            <input type="text" name="loginId" id="loginId" />
                        </h3>
                        <h3>
                            Enter the password :
                            <input type="password" name="password" id="password" />
                        </h3>
                        <div id="btns">
                            <h3>
                                <button type="submit">SUBMIT</button>
                                <button type="button"><a href="index.jsp">Back</a></button>
                            </h3>
                        </div>
                    </form>
                </div>
            </div>

            <div id="backend-messages">
                <h4>${ register }</h4>
                <h4>${ message }</h4>
            </div>
        </body>

        </html>