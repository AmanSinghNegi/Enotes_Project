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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91771
 */
public class UserServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String name=request.getParameter("fname");
                String age=request.getParameter("uage");
                String email=request.getParameter("uemail");
                String phone_number=request.getParameter("unumber");
                String password=request.getParameter("upass");
//                String gender=request.getParameter("gender");
                
                
//                if(cond!=null && cond.equals("checked"))
//                {
                UserDetails us=new UserDetails();
                us.setName(name);
                us.setAge(age);
                us.setEmail(email);
                us.setPhone_number(phone_number);
                us.setPassword(password);
//                us.setGender(gender);
                
                UserDao dao=new UserDao(DBConnect.getCOnn());
                boolean f=dao.addUser(us);
//                PrintWriter out=response.getWriter();
//                                out.print(dao.addUser(us));
//                                out.print(f);
//                                exit();
                HttpSession session;
                if(f)
                {
                    session=request.getSession();
                    session.setAttribute("reg-success","Registration Successfully....");
                    response.sendRedirect("signup.jsp");
                }
                
                else
                {
                    session=request.getSession();
                    session.setAttribute("Failed-msg","Something Went Wrong On Server");
                    response.sendRedirect("signup.jsp");
                }
//            }
               
//                else
//                {
//                    out.print("You Didn't Check Terms And Conditions");
//                }
          
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
