/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import com.user.Post;
import com.user.UserDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 91771
 */
public class PostDao {
    private Connection conn;

    public PostDao(Connection conn) {
        super();
        this.conn = conn;
    }
    
    public boolean addNotes(String ti,String co,int uid)
    {
        boolean f=false;
        try
        {
            String q="insert into post(title,content,uid)values(?,?,?)";
            PreparedStatement ps=conn.prepareStatement(q);
            
            ps.setString(1,ti);
            ps.setString(2, co);
            ps.setInt(3, uid);

            int i=ps.executeUpdate();
            
            if(i==1)
            {
                f=true;
            }
        }
        
        catch(Exception e)
        {
            
        }
        return f;
    }
    
}
