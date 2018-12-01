
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
    </head>
   
    <%@include file="UItemplate/header.jsp" %>
     <%@include file="UItemplate/headTag.jsp" %>
    <body class="bg">
          
        <h1 style="font-size: 200% ;color:blue" >Security</h1>
        <h1 id="PR" style="color: blue; font-size: 200% ; font-weight: bold">Collected Items</h1><br>
        
        <table rules="all" style="width:100%; border: 1px solid black" class="css-serial table table-bordered table-hover">
            <thead>
           
            <th style="text-align: center ;font-size: 100%;font-weight: bold">NO.</th>
             <th style="text-align: center ;font-size: 100%;font-weight: bold">NAME</th>
            <th style="text-align: center  ;font-size: 100%;font-weight: bold">LOST ITEM</th>
            <th style="text-align: center ;font-size: 100%;font-weight: bold">LOCATION</th>
             
            
 
                 
           
            </thead>
        <c:forEach items="${mtList}" var="data" varStatus="count">
           <tr>
                
                <td></td>
                <td>${data.name}</td>
                <td>${data.lostItem}</td>
                <td>${data.location}</td>
                
               

                
                
        
           </tr>
            </c:forEach>  
       
           
        </table>
    </body>
     <%@include file="UItemplate/footer.jsp" %>
</html>
