/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.DAO.PostDao;
import com.Db.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 91771
 */
@WebServlet(name = "AddNoteServlet", urlPatterns = {"/AddNoteServlet"})
public class AddNoteServlet extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int uid=Integer.parseInt(request.getParameter("uid"));
        String title=request.getParameter("title");
        String content=request.getParameter("content");
        
        PostDao dao=new PostDao(DBConnect.getCOnn());
        boolean f=dao.addNotes(title, content, uid);
        
        if(f)
        {
            System.out.println("Successfull");
        }
        else
        {
            System.out.println("Not Inserted");
        }
    }

}
