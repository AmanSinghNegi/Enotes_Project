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
    
            
              <%
            String FailedMsg=(String)session.getAttribute("Log-Failed");
            
            if(FailedMsg!=null)
            {%>
            <div class="alert alert-danger" role="alert">
  <%=FailedMsg  %>
</div>
            <%
                session.removeAttribute("Log-Failed");
                }
            %>
            
            <%
                String WithoutLogin=(String)session.getAttribute("Login-error");
                if(WithoutLogin!=null)
                {%>
                <div class="alert alert-danger" role="alert">
                    <%=WithoutLogin %>
                </div>
           <%
                session.removeAttribute("Log-Failed");
               }
                %>
    
                  <%
                String Logout=(String)session.getAttribute("logout-msg");
                if(Logout!=null)
                {%>
                <div class="alert alert-success" role="alert">
                    <%= Logout %>
                </div>
           <%
                session.removeAttribute("logout-msg");
               }
                %>
                
    <form action="loginServlet" method="post">
    <p> Username</p>
    <input type="text" name="username" placeholder="Enter Username" required>
    <p>Password </p>
    <input type="password" name="userpass" placeholder="Enter Password" required>
    <div>
        <input type="submit" name="" value="Login"> </div><br><br>
    </form>
    </div>
    </div>
   
    </body>
</html>
