<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html lang="en">

        <head>
            <meta charset="ISO-8859-1">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" type="text/css" href="<c:url value=" /resources/css/style.css" />" />
        </head>

        <body>

            <div id="form-container">
                <h1>Update Technology</h1>
                <div id="form">
                    <form action="updateTechnology" method="post">
                        <h3 style="display : none"><input type="text" name="id" id="id" value="${tech.getId()}"
                                style="display : none"></h3>
                        <h3>Technology Name : <input type="text" name="technologyName"
                                value="${tech.getTechnologyName()}"></h3>
                        <h3>Version : <input type="text" name="version" value="${tech.getVersion()}"></h3>
                        <h3>Owned Organization : <input type="text" name="ownedOrganization"
                                value="${tech.getOwnedOrganization()}"></h3>
                        <h3>Released Year : <input type="text" name="releasedYear" value="${tech.getReleasedYear()}">
                        </h3>
                        <div id="btns">
                            <h3><button type="submit">SUBMIT</button> <button type="button"><a
                                        href="index.jsp">Back</a></button></h3>
                        </div>
                    </form>
                </div>
            </div>
        </body>

        </html>