<%-- 
    Document   : addNotes
    Created on : Mar 28, 2023, 10:59:58 AM
    Author     : 91771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Notes</title>
        <%@include file="all_components/allcss.jsp" %>
    </head>
    <body>
        <%@include file="all_components/navbar.jsp" %>
        <br> 
        
        <h1 class="text-center">Add Your Notes</h1>
        
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <form action="AddNoteServlet" method="post">
  <div class="form-group">
      
      <%
          UserDetails us=(UserDetails)session.getAttribute("UserD");
       %>
       <input type ="hidden" value ="<%=us.getID()%>" name="uid">
       
    <label for="exampleInputEmail1">Add Title</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Title" name="title" required ="required"
      >
    <small id="emailHelp" class="form-text text-muted">Enter Title Of Your Notes.</small>
  </div>
 <div class="form-group">
    <label for="exampleInputEmail1">Add Notes</label>
    <textarea rows="5" cols="" class="form-control" name="content" required="required"></textarea>
  </div>
  
                        <div class="container text-center">
                             <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
</form>
                </div>
            </div>
        </div>
        
    </body>
</html>
