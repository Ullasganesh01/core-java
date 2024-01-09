<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

                th,
                td {
                    text-align: left;
                    padding: 8px;
                }

                tr:nth-child(even) {
                    background-color: #f2f2f2
                }

                th {
                    background-color: #04AA6D;
                    color: white;
                }

                #getUsersTable {
                    width: 80vw;
                    margin: auto;
                }

                #updatebtn {
                    background-color: rgba(240, 206, 14, 0.938);
                }

                #deletebtn {
                    background-color: rgba(235, 56, 21, 0.938);
                }

                .active {
                    padding: 5px;
                    background-color: #04AA6D;
                    border-radius: 8px;
                  }

                  #search-engine{
                    padding: 5px;
                    border-radius: 8px;
                  }

                  .search{
                    position: absolute;
                    right: 0px ;
                  }
            </style>
        </head>

        <body>
<div class="search">
        <form action="getPassports">

          <input id="search-engine" type="search" placeholder="Search by first name" name="firstName" aria-label="Search">
          <input id="search-engine" type="search" placeholder="Search by email" name="email" aria-label="Search">
          <button class="active" type="submit">Search</button>

        </form>
</div>
            <div id="table-container">
                <h2 style="width: fit-content;
                margin: auto;">List Of Users</h2>
                <div id="getUsersTable">
                    <table>
                        <tr>
                            <th>Sl.No</th>
                            <th>CPV Location</th>
                            <th>Passport Office</th>
                            <th>First Name</th>
                            <th>Surname</th>
                            <th>Date of Birth</th>
                            <th>Email-ID</th>
                            <th>Login-ID</th>
                            <th>Password</th>
                            <th>Hint Question</th>
                            <th>Hint Answer</th>
                            <th colspan="2" style="text-align: center;">Action</th>
                        </tr>
                        <c:forEach var="passport" items="${ passports }">
                            <tr>
                                <td>
                                    <c:out value="${passport.getId()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getCpvLocation()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getPassportOfficeLoc()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getFirstName()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getSurname()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getDob()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getEmail()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getLoginId()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getPassword()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getHintQuestion()}" />
                                </td>
                                <td>
                                    <c:out value="${passport.getHintAnswer()}" />
                                </td>
                                <td><button id="updatebtn"><a
                                            href="update?passId=${passport.getId()}">Update</a></button></td>
                                <td><button id="deletebtn"><a
                                            href="delete?passId=${passport.getId()}">Delete</a></button></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <h3 style="margin:auto;width:fit-content;margin-top:10px"><button type="button"><a
                        href="login.jsp">Back</a></button></h3>
            <div id="backend-messages">
                <h3> ${ message }</h3>
                <h3> ${ nousers } </h3>
                <h3> ${ noRecordsError } </h3>
                <h3>${param.updateMessage}</h3>
                <h3>${param.deleteMessage}</h3>
            </div>

        </body>

        </html>