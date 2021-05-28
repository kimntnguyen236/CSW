<%-- 
    Document   : index
    Created on : May 17, 2021, 10:04:53 AM
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee list!</h1>
        <h4><a href="create.jsp">Add new</a></h4>
        <table border="1">
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>phone</th>
                <th>Salary</th>
            </tr>
            <c:forEach var="e" items="${list}">
                <tr>
                    <td>${e.getEmployeecode()}</td>
                    <td>${e.getEmployeename()}</td>
                    <td>${e.getPhone()}</td>
                    <td>${e.getSalary()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
