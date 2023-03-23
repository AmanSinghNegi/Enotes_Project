<%-- 
    Document   : index
    Created on : Mar 21, 2023, 11:06:59 AM
    Author     : 91771
--%>

<%@page import="com.Db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <style type="text/css">
            .back-img
            {
                background:yellow; 
                width:100%;
                height:80vh;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <%@include file="all_components/allcss.jsp" %>
        
              
    </head>
    <body>
        <%@include file="all_components/navbar.jsp" %>
        
        <div class="back-img" style="color:red">hello</div>
    </body>
</html>
