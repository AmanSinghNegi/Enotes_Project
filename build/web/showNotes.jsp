<%-- 
    Document   : showNotes
    Created on : Apr 4, 2023, 11:17:49 AM
    Author     : 91771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UserDetails user1=(UserDetails)session.getAttribute("UserD");
    
    if(user1==null)
    {
        response.sendRedirect("login.jsp");
        session.setAttribute("Login-error","Please Login....");
    }
    %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Notes</title>
        <%@include file="all_components/allcss.jsp" %>
    </head>
    <body>
        <%@include file="all_components/navbar.jsp" %>
        <div class="container">
            <h2 class="text-center">All Notes</h2>
            <div class="row">
                <div class="col-md-12">
                    <div class="card mt-3">
                        <img src="img/notesbg.png" alt="alt" class="card-img-top mt-2 mx-auto"
                              style="max-width: 200px;"/>
                        
                        <div class="card-body p-4">
                            <h5 class="card-title">Title</h5>
                            <p>Paragraph</p>
                            
                            <p>
                                <b class="text-success">Published By:--</b><br><b
                                    class="text-primary"></b>
                                
                            </p>
                            
                              <p>
                                <b class="text-success">Published Date:--</b><br><b
                                    class="text-success"></b>
                            </p>
                            
                            <div class="container text-center mt-2">
                                <a href="" class="btn btn-danger">Delete</a>
                                 <a href="" class="btn btn-primary">Edit</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
