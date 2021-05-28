<%-- 
    Document   : create
    Created on : May 17, 2021, 10:43:27 AM
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
        <h1>Create new Employee</h1>
        <form action="AddServlet" method="POST">
            <input type="text" name="txtCode" placeholder="Enter Code"/>
            <input type="text" name="txtName" placeholder="Enter NAme"/>
            <input type="text" name="txtPass" placeholder="Enter Pass"/>
            <input type="text" name="txtPhone" placeholder="Enter Phone"/>
            <input type="text" name="txtSalary" placeholder="Enter Salary"/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
