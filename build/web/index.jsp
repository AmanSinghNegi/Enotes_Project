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
              <header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="img/mainbg.jpg" alt="Architecture" width="100%" height="700px">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>E</b></span> <span class="w3-hide-small w3-text-light-grey"> Notes</span></h1>
  </div>
        <div class="back-img" style="color:red">hello</div>
    </body>
</html>
