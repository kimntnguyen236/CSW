<%-- 
    Document   : create
    Created on : May 15, 2021, 2:01:16 AM
    Author     : lenovo
--%>
<%@page import="java.util.List"%>
<%@page import="ws.Worker"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap.min.css" rel="stylesheet" type="text/css"/>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <style>
            input{
                width: 100%;
                outline: none;
                border: none;
                border-radius:5px;
                padding: 5px 10px;
                margin-bottom: 10px;
            }
        </style>
        <title>create Page</title>
    </head>
    <body style="background-color: #bee5eb">
        <div class="container">
            </br>
            </br>
            
            <h3> Create new Worker</h3>
             </br>
            <div class="row">
                <div class="col-md-5"> 
              <form action="AddServlet" method="POST">
                <label>Name</label>
                <input type="text" name="txtName" placeholder="Enter Name">
                <label>Phone</label>
                <input type="text" name="txtPhone" placeholder="Enter Phone">
                <label>Salary</label>
                <input type="text" name="txtSalary"  placeholder="Enter Salary">
                <label>Day Number</label>
                <input type="text" name="txtdayNumber" placeholder="Enter Day Number">
                <input style="color: white;background-color: dodgerblue;font-weight: bold;padding: 8px" type="submit" value="SAVE">
            </form>
                </div>
            </div>
      
        </div>
    </body>
</html>
