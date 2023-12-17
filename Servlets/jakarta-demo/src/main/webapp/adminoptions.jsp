<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <!--<link rel="stylesheet" href="userpage.css">-->
    <title>User Page</title>
    <style>
        table {
          border-collapse: collapse;
          width: 100%;
          background-color: rgb(168, 246, 237);
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

        #getUsersTable{
            width: 80vw;
            margin: auto;
        }

        #updatebtn{
            background-color: rgba(240, 206, 14, 0.938);
        }

        #deletebtn{
            background-color: rgba(235, 56, 21, 0.938);
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
                <li>
                    <a href="./login.jsp"><button>Login Page</button></a>
                </li>
                <li>
                    <button type="button"><a href="./login.jsp">Back</a></button>
                </li>
                <li>
                    <a href="#" id="nxtpage"><button id="nextPage">Next Page</button></a>
                </li>
            </ul>
        </nav>
    </header>

    <!-- <li>
        <a href="getUsers"><button>Get All Users</button></a>
    </li> -->

    <div id="table-container">
        <h2>List Of Users</h2>
        <div id="getUsersTable">
        <table>
            <tr>
                <th>Sl.No</th>
                <th>User Name</th>
                <th>Name</th>
                <th>Age</th>
                <th>Phone Number</th>
                <th colspan="2" style="text-align: center;">Action</th>
            </tr>
            <c:forEach var="user" items="${ users }">
                <tr>
                    <td><c:out value="${user.getId()}"  /></td>
                    <td><c:out value="${user.getUName()}" /></td>
                    <td><c:out value="${user.getName()}" /></td>
                    <td><c:out value="${user.getAge()}" /></td>
                    <td><c:out value="${user.getPNumber()}" /></td>
                    <td><button id="updatebtn"><a href="update?userId=${user.getId()}">Update</a></button></td>
                    <td><button id="deletebtn"><a href="delete?userId=${user.getId()}">Delete</a></button></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </div>

    <div id="backend-messages">
    <h3> ${ message }</h3>
    <h3> ${ nousers } </h3>
    <h3>${updateMessage}</h3>
    <h3>${deleteMessage}</h3>
    </div>

</body>
</html>