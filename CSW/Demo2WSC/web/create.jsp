<%-- 
    Document   : create.jsp
    Created on : May 14, 2021, 6:04:42 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>create Page</title>
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
    <body class="container row" style="background-color: #ececf6">
        
       
        <div class="col-md-2"></div>
        <div class="col-md-6">
              </br>
                </br>
             <h3>Create new Customer</h3>
               </br>
            <form action="AddServlet" method="POST">
                <label> Name</label>
                <input type="text" name="txtName" />
                <label> Age</label>
                <input type="text" name="txtAge" />
                <label> Height</label>
                <input type="text" name="txtHeight" />
                <label> Weight</label>
                <input type="text" name="txtWeight"/>
                <input style="background-color: #34ce57; font-weight: bold; color: white; padding: 7px" type="submit" name="action" value="create"/>
            </form> 
        </div>
</body>
</html>
