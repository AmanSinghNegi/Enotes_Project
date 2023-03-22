<%-- 
    Document   : login
    Created on : Mar 21, 2023, 11:07:45 AM
    Author     : 91771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" 
              href="css/loginstyle.css">
        <%@include file="all_components/allcss.jsp" %>
    </head>
    <body>
    <%@include file="all_components/navbar.jsp" %>
    <body background="slider_bg.jpg">
        <div class="container">
        <div class="imagebg">
            <img src="img/loginbg.png" alt="">
        </div>

    <div class="loginbox">
        <img src="img/avatar2.png" class="avatar">
    <h1>Login Here</h1><BR>
    <form>
    <p> Username</p>
    <input type="text" name="" placeholder="Enter Username">
    <p>Password </p>
    <input type="password" name="" placeholder="Enter Password">
    <input type="submit" name="" value="Login"> <br><br>
    </form>
    </div>
    </div>
   
    </body>
</html>
