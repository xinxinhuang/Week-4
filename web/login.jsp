<%-- 
    Document   : login
    Created on : Oct 2, 2017, 1:23:40 PM
    Author     : 721292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>-REMEMBER ME LOGIN PAGE-</h1>
        <h3 style="color:red;">${message}</h3>
         <div>
            <form action="Login" method="post">
                Username :   <input type="text" name="usern" value="${usern}"><br>
                Password :   <input type="password" name="passw"><br>
                Remember Me <input type="checkbox" name="reme" value="remeber" ${checked}><br>
                <input type="submit" value="Login">
            </form>
        </div>
    </body>
</html>
