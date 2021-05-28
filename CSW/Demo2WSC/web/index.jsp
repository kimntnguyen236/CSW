<%-- 
    Document   : index
    Created on : May 14, 2021, 10:48:21 AM
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>index Page</title>
        <style>
            input{
                width: 100%;
                outline: none;
                margin-bottom: 10px;
                padding: 4px 10px; 
                border-radius: 5px;
                border: none;

            }
        </style>
    </head>
    <body style="background-color: #ececf6">
        <div class="container">
            </br>    
            </br>    
            <h1>List of Customer</h1>  
 </br> 
 </br> 
            <div class="row">

                <div class="col-md-3">
                    <h5>
                        <a href="create.jsp">Add new Customer</a>  
                    </h5>
                </div>
                <div class="col-md-4"> 
                    <div>
                        <form name="myform" action="HomeServlet" method="POST" onsubmit="return validation()">

                            <input type="text"  name="Weight" placeholder="Weight (kg)"/>
                            <span style="color: red" id ="weight"></span>

                            <input type="text"  name="Height" placeholder="Height (m)"/>
                            <span style="color: red" id ="height"></span>
                            <input style="background-color: dodgerblue; font-weight: bold; color: white" type="submit" name="action" value="CalculateBMI"/>
                        </form> 
                    </div>
                </div>
                <div class="col-md-3" style="padding: 50px">
                    <span style="font-weight: bold"> BMI: <i style=" color: ${cl};">${BMI}</i></span>
                    <input readonly="" style="width: 200px;height: 40px ; color: white;background-color: ${cl}; font-weight: bold; text-align: center" value="${status}"/>
                </div>

            </div>
  
            <table class="table" style=" background-color: white; border-radius: 0 0 10px 10px">
                <tr style="color: white; background-color: black">
                    <th>ID</th> 
                    <th>Name</th> 
                    <th>Age</th> 
                    <th>Height</th> 
                    <th>Weight</th> 
                    <th>BMI</th> 
                    <th>Status</th> 
                    <th>Action</th> 

                </tr>
                <c:forEach var="c" items="${list}">
                    <tr>
                        <td>${c.getId()}</td>
                        <td>${c.getCustomername()}</td>
                        <td>${c.getAge()}</td>
                        <td>${c.getHeight()}</td>
                        <td>${c.getWeight()}</td>
                        <td>${c.getWeight()/(c.getHeight()*c.getHeight())}</td>
                        <td>
                            <c:set var="bmi" value="${c.getWeight()/(c.getHeight()*c.getHeight())}"></c:set>
                            <c:choose>
                                <c:when test="${bmi<18.5}">
                                    <span style="color: #007bff; font-weight: bold">UnderWeight</span>
                                </c:when>
                                <c:when test="${bmi>=18.5 && bmi<25}">
                                    <span style="color: green;font-weight: bold">Normal</span>
                                </c:when>
                                <c:when test="${bmi>=25 && bmi <30}">
                                    <span style="color: orange; font-weight: bold">Over Weight</span>
                                </c:when>
                                <c:when test="${bmi>=30}">
                                    <span style="color: red; font-weight: bold">Obese</span>
                                </c:when>
                            </c:choose>
                        </td>
                        <td><a href="HomeServlet?action=Del&id=${c.getId()}">Delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
<script>
    function validation() {
        var height = document.myform.Height.value;
        var weight = document.myform.Weight.value;

        if (weight == null || weight == "") {

            document.getElementById("weight").innerHTML = "weight khong duoc de trong!.";
            return  false;
        } else if (isNaN(weight)) {

            document.getElementById("weight").innerHTML = "weight phai la so!";
            return  false;
        } else if (weight.charCodeAt(0) == 32) {

            document.getElementById("weight").innerHTML = "weight khong duoc chua khoang trong o dau!";
            return  false;
        } else if (height.charCodeAt(0) == 32) {

            document.getElementById("height").innerHTML = "height khong duoc chua khoang trong o dau!";
            return  false;
        } else if (height == null || height == "") {
            document.getElementById("height").innerHTML = "height khong duoc de trong!.";
            return  false;
        } else if (isNaN(height)) {

            document.getElementById("height").innerHTML = "height phai la so!";
            return  false;
        } else {
            return  true;
        }
    }






</script>