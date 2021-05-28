<%-- 
    Document   : index
    Created on : May 15, 2021, 1:56:54 AM
    Author     : lenovo
--%>

<%-- 
    Document   : index
    Created on : May 14, 2021, 11:26:03 AM
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
        <link href="static/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            </br>
            </br>
           <h1>List of Worker</h1>  
              </br>
          
              <h4>  <a href="create.jsp">Add new Worker</a></h4>
             </br>
      
           <table class="table">
               <tr style="color: white; background-color: #1d2124">
                   <th>ID</th>
                   <th>Name</th>
                   <th>Phone</th>
                   <th>Salary</th>
                   <th>Day Number</th>
                   <th>BHXH</th>
                   <th>BHTN</th>
                   <th>Currency Salary</th>
               </tr>
               <c:forEach var="k" items="${list}">
                   <tr>
                       <td>${k.getId()}</td>
                       <td>${k.getName()}</td>
                       <td>${k.getPhone()}</td>
                       <td>${k.getSalaryPerday()}</td>
                       <td>${k.getDaynumber()}</td>
                       <td>${k.getBhxh()}</td>
                       <td>${k.getBhtn()}</td>
                       <td>${(k.getSalaryPerday()*k.getDaynumber())-k.getBhxh()-k.getBhtn()}</td>  
                   </tr>
               </c:forEach>
           </table>
        </div>
       
    </body>
</html>
