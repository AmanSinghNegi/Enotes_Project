/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;
import com.user.UserDetails;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author 91771
 */
public class UserDao {
private Connection conn;

    public UserDao(Connection conn) {
        super();
        this.conn = conn;
    }
    
    public boolean addUser(UserDetails us)
    {
        boolean f=false;
         try
            {
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","");
                String query="insert into user(name,age,email,phone_number,password) values(?,?,?,?,?)";
                PreparedStatement pstmt=conn.prepareStatement(query);
                pstmt.setString(1,us.getName());
                pstmt.setString(2,us.getAge());
                pstmt.setString(3,us.getEmail());
                pstmt.setString(4,us.getPhone_number());
                pstmt.setString(5,us.getPassword());
//                pstmt.setString(6,us.getGender());
                
               

                        int i=pstmt.executeUpdate();
                
                if(i==1)
                {
                    f=true;
                }
                out.println("<h1> Done.........</h1>");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                out.println("<h1>Error.........</h1>");
            }
        return f;
    }
    
    public UserDetails loginUser(UserDetails us)
    {
        
        UserDetails user = null;
        
        try
        {
            String query="select * from user where email=? and password=?";
            PreparedStatement pstmt=conn.prepareStatement(query);
            pstmt.setString(1,us.getEmail());
            pstmt.setString(2,us.getPassword());
            
            ResultSet rs=pstmt.executeQuery();
            
            if(rs.next())
            {
                user=new UserDetails();
                user.setID(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getString("age"));
                user.setEmail(rs.getString("email"));
                user.setPhone_number(rs.getString("phone_number"));
                user.setPassword("password");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }

}
