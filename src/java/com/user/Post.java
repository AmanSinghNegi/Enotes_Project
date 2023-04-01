/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user;

import java.sql.Date;

/**
 *
 * @author 91771
 */
public class Post {
    private int id;
    private String title;
    private String Content;
    private Date pdate;
    private UserDetails user;

    public Post(int id, String title, String Content, Date pdate, UserDetails user) {
        super();
        this.id = id;
        this.title = title;
        this.Content = Content;
        this.pdate = pdate;
        this.user = user;
    }
    ;
    public Post()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return Content;
    }

    public Date getPdate() {
        return pdate;
    }

    public UserDetails getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }
    
    
    
    
    
    
}
