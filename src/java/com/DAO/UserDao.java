/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;
import java.sql.Connection;
/**
 *
 * @author 91771
 */
public class UserDao {
    private static Connection conn;
    public static Connection getCOnn()
    {
        
        
        return conn;
    }
}
