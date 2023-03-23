/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import com.DAO.UserDao;
import com.Db.DBConnect;
import com.user.UserDetails;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author 91771
 */
    @WebServlet("/UserServlet")
public class UserServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
            {
                String name=request.getParameter("fname");
                String age=request.getParameter("uage");
                String email=request.getParameter("uemail");
                String phone_number=request.getParameter("unumber");
                String password=request.getParameter("fpass");
//                String gender=request.getParameter("gender");
                
                
//                if(cond!=null && cond.equals("checked"))
//                {
                UserDetails us=new UserDetails();
                us.setName(name);
//                us.setAge(age);
//                us.setEmail(email);
//                us.setPhone_number(phone_number);
//                us.setPassword(password);
//                us.setGender(gender);
                
                UserDao dao=new UserDao(DBConnect.getCOnn());
                boolean f=dao.addUser(us);
                PrintWriter out=response.getWriter();

                out.println("name");
                exit();
                
                if(f)
                {
                    out.println("Successfull");
                }
                
                else
                {
                    out.println("Data Not Inserted");
                }
//            }
               
//                else
//                {
//                    out.print("You Didn't Check Terms And Conditions");
//                }
          }

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
