/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 91771
 */
public class DBConnect {
        private static Connection conn;
    public static Connection getCOnn()
    {
        try{
        if(conn==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube\",\"root\",\"\"");
        }
     }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}
