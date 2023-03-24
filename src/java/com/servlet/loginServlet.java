/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.DAO.UserDao;
import com.Db.DBConnect;
import com.user.UserDetails;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91771
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        String email=request.getParameter("username");
        String password=request.getParameter("userpass");
        
        UserDetails us=new UserDetails();
        us.setEmail(email);
        us.setPassword(password);
        
         UserDao dao=new UserDao(DBConnect.getCOnn());
        boolean f=dao.loginUser(us);
        
         HttpSession session;
                if(f)
                {
                    session=request.getSession();
                    response.sendRedirect("home.jsp");
                }
                
                else
                {
                    session=request.getSession();
                    session.setAttribute("Log-Failed","Invalid Email or Password");
                    response.sendRedirect("login.jsp");
                }
    }
}
