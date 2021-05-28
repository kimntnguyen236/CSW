<%-- 
    Document   : login
    Created on : May 17, 2021, 10:54:46 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Log In</h1>
        <form action="LogSrvlet" method="POST">
            <input type="text" name="txtCode"/>
            <input type="text" name="txtPASS"/>
            <input type="submit" value="LOGIN"/>
        </form>
    </center>
    </body>
</html>
