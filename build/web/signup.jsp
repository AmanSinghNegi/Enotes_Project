<%-- 
    Document   : signup
    Created on : Mar 21, 2023, 5:36:21 PM
    Author     : 91771
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-Up</title>
        <link rel="stylesheet"
              href="css/signup_style.css">
        <%@include file="all_components/allcss.jsp" %>
    </head>
<body>
    <%@include file="all_components/navbar.jsp" %>
<section class="bodyy">
    <div class="imagebg">
    <img src="img/loginbg.png" width="40%" alt="">
</div>
    <div class="container0">
        
        <div class="title2">SIGNUP FORM</div><br>
        
        <%
            String regMsg=(String)session.getAttribute("reg-success");
            
            if(regMsg!=null)
            {%>
            <div class="alert alert-success" role="alert">
  <%=regMsg %>
</div>
            <%
                session.removeAttribute("reg-success");
                }
            %>
            
            
              <%
            String FailedMsg=(String)session.getAttribute("Failed-msg");
            
            if(FailedMsg!=null)
            {%>
            <div class="alert alert-danger" role="alert">
  <%=FailedMsg  %>
</div>
            <%
                session.removeAttribute("Failed-msg");
                }
            %>
        
        <form action="UserServlet1" method="post"> <br>
            <div class="user-details" > 
                <div class="input-box">
                    <span class="details"">Full Name</span>
                    <input type="text"  name="fname" placeholder="Enter Your Name" required>
                </div>

                <div class="input-box">
                    <span class="details">Age</span>
                    <input type="text"  name="uage" placeholder="Enter Your Age" required>
                </div>

                <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text"  name="uemail" placeholder="Enter Your Email" required>
                </div>

                <div class="input-box">
                    <span class="details">Phone Number</span>
                    <input type="text"  name="unumber" placeholder="Enter Your Number" required>
                </div>

                <div class="input-box">
                    <span class="details">Password</span>
                    <input type="password"  name="upass" placeholder="Enter Your Password" required>
                </div>

               
           </div>
<!--            <div class="gender-details">
                <input type="radio" name="gender" value="Male" id="dot-1">
                <input type="radio" name="gender" value="Female" id="dot-2">
                <input type="radio" name="gender" id="dot-3">
                <span class="gender-title">GENDER</span>
            <div class="category">
                <label for="dot-1">
                <span class="dot one"></span>
                <span class="gender">Male</span>
            </label>

            <label for="dot-2">
                <span class="dot two"></span>
                <span class="gender">Female</span>
            </label>
                </div>           
            </div>-->
               
<!--            <div class="tacbox">
                <input id="checkbox" type="checkbox" name="condition" />
  <label for="checkbox"> I agree to these <a href="#">Terms and Conditions</a>.</label>
</div>-->

            <div class="button">
                <input type="submit" value="Register">
            </div>
        </form>
        </div>
        </div>
    </section>
    </body>
</html>
