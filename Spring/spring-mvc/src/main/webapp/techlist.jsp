<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>" />
    <title>Tech List Page</title>
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

   <div id="table-container">
        <h2>List Of Technologies</h2>
        <div id="getUsersTable">
        <table>
            <tr>
                <th>Sl.No</th>
                <th>Technology Name</th>
                <th>Version</th>
                <th>Owner</th>
                <th>Released Year</th>
                <th colspan="2" style="text-align: center;">Action</th>
            </tr>
            <c:forEach var="tech" items="${ techs }">
                <tr>
                    <td><c:out value="${tech.getId()}"  /></td>
                    <td><c:out value="${tech.getTechnologyName()}" /></td>
                    <td><c:out value="${tech.getVersion()}" /></td>
                    <td><c:out value="${tech.getOwnedOrganization()}" /></td>
                    <td><c:out value="${tech.getReleasedYear()}" /></td>
                    <td><button id="updatebtn"><a href="update?techId=${tech.getId()}">Update</a></button></td>
                    <td><button id="deletebtn"><a href="delete?techId=${tech.getId()}">Delete</a></button></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </div>
<h3 style="margin:auto;width:fit-content;margin-top:10px"><button type="button"><a href="index.jsp">Back</a></button></h3>
<div id="backend-messages">
    <h3>${deletedMessage}</h3>
    <h3>${updatedMessage}</h3>
</div>

</body>
</html>