<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <title>Passport Page</title>
                <link rel="stylesheet" href="./resources/css/passport.css">
            </head>

            <body>
                <div>
                    <div class="head">
                        <h3>Passport Update Page</h3>
                    </div>
                    <hr>

                    <form action="updatePassport" method="post" id="passForm" onsubmit="return validateForm()">
                        <input type="text" name="id" id="id" value="${passport.getId()}" style="display : none">
                        <table>
                            <tr>
                                <td>
                                    <label>Register to apply at : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <c:set var="cpvLoc" value="${passport.getCpvLocation()}" />
                                    <input type="radio" name="cpvLocation" value="delhi" id="cpvdelhi" <c:if
                                        test="${fn:contains(cpvLoc, 'delhi')}"> checked </c:if> required>
                                    <label for="cpvdelhi">CPV Delhi</label><br>
                                    <input type="radio" name="cpvLocation" value="passportOffice" id="po" <c:if
                                        test="${fn:contains(cpvLoc, 'passportOffice')}">
                                    checked
                                    </c:if>>
                                    <label for="po">Passport Office</label><br>
                                </td>
                                <td>
                                    <span class="error-message" id="registerLocError">Please select any one of these
                                        options</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Passport Office :<span class="mandatory">*</span> <br>
                                        <small>(As per Present Residential Address)</small></label>
                                </td>
                                <td>
                                    <c:set var="passLoc" value="${passport.getPassportOfficeLoc()}" />
                                    <select name="passportOfficeLoc" id="passOfficeLoc" required>
                                        <option value>----select----</option>
                                        <option value="bengaluru" <c:if test="${fn:contains(passLoc, 'bengaluru')}">
                                            selected </c:if> >Bengaluru</option>
                                        <option value="chennai" <c:if test="${fn:contains(passLoc, 'chennai')}">
                                            selected </c:if> >Chennai</option>
                                        <option value="kochi" <c:if test="${fn:contains(passLoc, 'kochi')}"> selected
                                            </c:if> >Kochi</option>
                                        <option value="hyderabad" <c:if test="${fn:contains(passLoc, 'hyderabad')}">
                                            selected </c:if> >Hyderabad</option>
                                        <option value="mumbai" <c:if test="${fn:contains(passLoc, 'mumbai')}"> selected
                                            </c:if> >Mumbai</option>
                                    </select>
                                </td>
                                <td>
                                    <span class="error-message" id="selectOfficeError">Please select any city</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>First Name : <span class="mandatory">*</span><small>(Max 45
                                            characters)</small></label>
                                </td>
                                <td>
                                    <input type="text" name="firstName" maxlength="45" id="firstName"
                                        onblur="validateFName()" value="${passport.getFirstName()}">
                                </td>
                                <td>
                                    <span class="error-message" id="fnameError">Please provide a valid name</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Surname : <small>(Max 45 characters)</small></label>
                                </td>
                                <td>
                                    <input type="text" name="surname" maxlength="45" id="surname"
                                        onblur="validateSurname()" value="${passport.getSurname()}">
                                </td>
                                <td>
                                    <span class="error-message" id="surnameError">Please provide a valid surname</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Date of Birth (DD/MM/YYYY) : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <input type="date" name="dob" max="2020-01-01" id="dob" value="${passport.getDob()}"
                                        required>
                                </td>
                                <td>
                                    <span class="error-message" id="dobError">Please select a date</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Email-ID : <span class="mandatory">*</span><small>(Max 35
                                            characters)</small></label>
                                </td>
                                <td>
                                    <input type="email" name="email" maxlength="35" id="emailId"
                                        onblur="validateEmail()" value="${passport.getEmail()}">
                                </td>
                                <td>
                                    <span class="error-message" id="emailError">Please provide a valid email</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Do you want your Login Id <br>to be same as E-mail Id?</label>
                                </td>
                                <td>
                                    <input type="radio" name="sameEmail" id="yes" value="yes"
                                        onclick="handleRadioClick('yes')">
                                    <label for="yes">Yes</label>&nbsp;
                                    <input type="radio" name="sameEmail" id="no" value="no"
                                        onclick="handleRadioClick('no')">
                                    <label for="no">No</label>
                                </td>
                                <td>
                                    <span class="error-message" id="sameEmailError">Please select one option</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Login-ID : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <input type="text" name="loginId" id="loginId" value="${passport.getLoginId()}">
                                </td>
                                <td>
                                    <span class="error-message" id="loginIdError">Please provide a valid login Id</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Password : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <input type="text" name="password" id="password" onblur="validatePassword()"
                                        value="${passport.getPassword()}">
                                </td>
                                <td>
                                    <span class="error-message" id="passwordError">Please provide a valid
                                        password</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Confirm Password : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <input type="password" name="confirmPwd" id="confirmPwd"
                                        onblur="validateConfirmPassword()" value="${passport.getPassword()}">
                                </td>
                                <td>
                                    <span class="error-message" id="confirmPassError">Passwords do not match</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Hint Question : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <c:set var="hintQuestion" value="${passport.getHintQuestion()}" />
                                    <select name="hintQuestion" id="hintQuestion">
                                        <option value>----select----</option>
                                        <option value="birthCity" <c:if
                                            test="${fn:contains(hintQuestion, 'birthCity')}"> selected </c:if> >Birth
                                            City</option>
                                        <option value="favColor" <c:if test="${fn:contains(hintQuestion, 'favColor')}">
                                            selected </c:if> >Favourite Color</option>
                                        <option value="favFood" <c:if test="${fn:contains(hintQuestion, 'favFood')}">
                                            selected </c:if> >Favourite Food</option>
                                        <option value="favCric" <c:if test="${fn:contains(hintQuestion, 'favCric')}">
                                            selected </c:if> >Favourite Cricketer</option>
                                    </select>
                                </td>
                                <td>
                                    <span class="error-message" id="hintQuesError">Please select a hint question</span>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>Enter Answer : <span class="mandatory">*</span></label>
                                </td>
                                <td>
                                    <input type="text" name="hintAnswer" id="hintAnswer" onblur="validateHintAnswer()"
                                        value="${passport.getHintAnswer()}">
                                </td>
                                <td>
                                    <span class="error-message" id="hintAnsError">Please provide hint answer</span>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="1" style="float: right;">
                                    <input id="submit" type="submit" value="Update">
                                </td>
                                <td colspan="1">
                                    <a href="userpage.jsp"><button type="button">BACK</button></a>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>

                <script src="./resources/js/passport.js"></script>
            </body>

            </html>