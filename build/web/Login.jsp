<%-- 
    Document   : homepage
    Created on : May 22, 2017, 2:10:47 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="resources/css/header-footer.css" rel="stylesheet" type="text/css"/>
     
 <style>
     
body {background-color: powderblue;
text-align:center;}

p    
{
color: black;
font-size: 150%;
}

legend   {text-align:center;}


</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <div style="color:powderblue"> 
        <body class="bg site">
    <%@include file="UItemplate/headTag.jsp" %>
    <%@include file="UItemplate/header.jsp" %>
        
    <h1 style="color: blue;text-align:center;font-size: 300%">Login Page</h1><br>
        
        <form align="center">
        <fieldset>
            <legend style="font-size:125%; color:black " ><b>Login Details</b></legend>
        <p align="centre">
          <label>Login id</label>
          <input type="text"><br>
        </p>
        <p>
          <label>Password</label>
          <input type = "password"><br>
        </p>
        <button type="button" style="font-size: 150 ;color: black" >Login</button>
      
        </fieldset>
        </form>
        
    </body>
    </div>
     <%@include file="UItemplate/footer.jsp" %>
</html>

