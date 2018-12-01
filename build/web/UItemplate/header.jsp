<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <div class="row" style="background-color: #F5C52C">
        <div class="text-left col-md-1">
            <img src="resources/images/nmims-logo.jpg" alt="nmims Logo" width="300" height="200"/>
        </div>
        <div class="col-lg-offset-2 col-md-6" style="padding-top: 20px">
            <h1 class="text-center" style="font-weight: bold;font-size: 300%;color:red">Lost and Found Management System</h1> 
            <marquee direction="left" scrollamount='6'><h1 class="text-center" style="font-weight: bold;font-size:150%;color:blue">MUKESH PATEL SCHOOL OF TECHNOLOGY MANAGEMENT AND ENGINEERING</h1></marquee> 
        </div>
    </div>
    
    <div class="container-fluid custom-container">
        
        <c:if test="${userId eq '1'}">
            <a href="Requester.jsp">Home</a>
         ]
            <a href="index.jsp">index</a>
        </c:if>
            
        
            
        <c:if test="${userId eq '2'}">
            <a href="APRServlet">Pending Requests</a>
            <div class="custom-dropdown">
                <button class="dropbtn">View</button>
                <div class="custom-dropdown-content">
                    <a href="CollectedServlet">Collected Items</a>
                        <a href="MatchedServlet">Matched Items</a>
                </div>
            </div>
                <a href="HistoryServlet">History</a>
            
            <a href="index.jsp">index</a>
        </c:if>
            
        <c:if test="${userId eq '3'}">
            <a href="index.jsp">index</a>
        </c:if>
            
        <a style="float: right; color:white;font-weight: bold" class="active" href="Login.jsp">Log Out</a>
    </div>

</header>