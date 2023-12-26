<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html lang="en">

        <head>
            <link rel="stylesheet" type="text/css" href="<c:url value=" /resources/css/style.css" />" />
        </head>

        <body>
            <c:forEach items="${ errors }" var="error">
                <h3> ${ error.getDefaultMessage() } </h3>
            </c:forEach>
            <div id="form-container">
                <h1>Add Technology</h1>
                <div id="form">
                    <form action="saveTechnology" method="post">
                        <h3>Technology Name : <input type="text" name="technologyName"></h3>
                        <h3>Version : <input type="text" name="version"></h3>
                        <h3>Owned Organization : <input type="text" name="ownedOrganization"></h3>
                        <h3>Released Year : <input type="text" name="releasedYear"></h3>
                        <div id="btns">
                            <h3><button type="submit">SUBMIT</button> <button type="button"><a
                                        href="index.jsp">Back</a></button></h3>
                        </div>
                    </form>
                </div>
            </div>
            <h3 style="margin:auto;width:fit-content;margin-top:10px"><a href="getAllTech">Get All Techs</a></h3>

            <div id="backend-messages">
                <h3>${addedMessage}</h3>
            </div>
        </body>

        </html>