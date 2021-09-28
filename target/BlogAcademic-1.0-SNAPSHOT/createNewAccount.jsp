<%-- 
    Document   : createNewAccount
    Created on : Jun 28, 2021, 1:34:55 PM
    Author     : thien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DispatchController" method="POST">
            <c:set var="errors" value="${requestScope.INSERT_ERRORS}"/>
            Username* <input type="text" name="txtUsername" value="${param.txtUsername}" />(6-12 char)<br/>
            <c:if test="${not empty errors.usernameLengthErr}">
                <font color="red">
                ${errors.usernameLengthErr}
                </font>
                <br/>
            </c:if> 
            <c:if test="${not empty errors.usernameIsExisted}">
                <font color="red">
                ${errors.usernameIsExisted}
                </font>
                <br/>
            </c:if>
            Password* <input type="password" name="txtPassword" value="" />(6-30 char)<br/>
            <c:if test="${not empty errors.passwordLengthErr}">
                <font color="red">
                ${errors.passwordLengthErr}
                </font>
                <br/>
            </c:if>
            Confirm Password* <input type="password" name="txtConfirm" value="" />(6-30 char)<br/>
            <c:if test="${not empty errors.comfirmNotMatch}">
                <font color="red">
                ${errors.comfirmNotMatch}
                </font>
                <br/>
            </c:if>
            Full name* <input type="text" name="txtFullname" value="${param.txtFullname}"/>(6-30 char)<br/>
            <c:if test="${not empty errors.fullNameLengthErr}">
                <font color="red">
                ${errors.fullNameLengthErr}
                </font>
                <br/>
            </c:if>
            <input type="submit" value="Create New Account" name="btAction" />
        </form>
    </body>
</html>
