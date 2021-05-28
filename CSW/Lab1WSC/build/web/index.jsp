<%-- 
    Document   : index
    Created on : May 10, 2021, 11:24:53 AM
    Author     : sinhtm
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
        <br/>
        <h3>
            <a href="create.jsp">Create new</a>
        </h3>
        <h1>List of Countries</h1>
        <table border="1">
            <tr>
                <th>Country Name</th>
                <th>Country Code</th>
                <th>Language Code</th>
                <th>Population</th>
            </tr>
            <c:forEach var="item" items="${list}">
                <tr>
                    <td><c:out value="${item.getName()}"/></td>
                    <td><c:out value="${item.getCountrycode()}"/></td>
                    <td><c:out value="${item.getLanguagecode()}"/></td>
                    <td><c:out value="${item.getPopulation()}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
