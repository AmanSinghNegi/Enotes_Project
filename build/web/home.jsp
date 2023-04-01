<%-- 
    Document   : home
    Created on : Mar 24, 2023, 3:02:02 PM
    Author     : 91771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"
              href="css/homecss.css">
        <%@include file="all_components/allcss.jsp" %>
        
    </head>
    <body>
        <div class="container-fluid p-0">
        <%@include file="all_components/navbar.jsp" %>
        <div class="card imagebg">
            <div class="card-body text-center">
                <img src="img/notesbg.png" alt="NOTES" class="img-fluid mx-auto" style="max-width: 440px"/>
                <h1>START TAKING YOUR NOTES..</h1><br>
            <a href="addNotes.jsp" class="btn btn-outline-primary">START HERE</a>
            </div>         
        </div>
        </div>
         
  
</header>
        <!-- Page content -->


    </body>
</html>
