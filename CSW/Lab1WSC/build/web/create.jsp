<%-- 
    Document   : create
    Created on : May 10, 2021, 11:51:13 AM
    Author     : sinhtm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create a Country</h1>
        <form action="CountryServlet" method="Post">
            <input type="text" name="txtName" placeholder="Enter country name..."/><br/><br/>
            <input type="text" name="txtCode" placeholder="Enter country code..."/><br/><br/>
            <input type="text" name="txtLCode" placeholder="Enter language code..."/><br/><br/>
            <input type="text" name="txtPop" placeholder="Enter country population..."/><br/><br/>
            <input type="submit" value="Create" name="action"/>
        </form>
    </body>
</html>
