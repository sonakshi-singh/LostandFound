<%-- 
    Document   : Security
    Created on : Jun 23, 2017, 10:18:51 AM
    Author     : Purvika Shukla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Security</title>
    </head>
    <%@include file="UItemplate/header.jsp" %>
    <%@include file="UItemplate/headTag.jsp" %>
    <body class="bg">
        <h1 style="font-size:250%;font-weight:bold;color:blue" >Security</h1><br><br>
        <!--h1 id="PR" style="color: blue; font-size: 200% ; font-weight: bold">Pending Requests</h1><br-->
        <form class="form-inline" action="CheckStatusServlet">
            <div class="form-group">
                <label for="serialNo" style="font-size: 150%;color: blue">Enter Serial No.:</label><br>
                <input type="text" class="form-control" id="SerialNo." placeholder="Enter Serial No.">
            </div><br><br>
            <button type="submit" class="btn btn-default" style="font-weight: bold">Check Status</button>
        </form>
    </body>
    <%@include file="UItemplate/footer.jsp"%>
</html>
