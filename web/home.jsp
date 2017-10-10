<%-- 
    Document   : home
    Created on : Oct 2, 2017, 1:08:24 PM
    Author     : 721292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h3>Hello ${us.getUsername()}</h3>
        <a href ="?message=You have successfully loged out!" >Log out</a>
    </body>
</html>
