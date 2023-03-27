/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user;

/**
 *
 * @author 91771
 */
public class UserDetails {
    private int id;
    private String name;
    private String age;
    private String email;
    private String phone_number;
    private String password;
//    private String gender;
    
    public UserDetails()
    {
        super();
    }

    public UserDetails(String name, String age, String email, String phone_number, String password) {
        super();
        this.id=id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
//        this.gender = gender;
    }

    public int getID()
    {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getPassword() {
        return password;
    }

//    public String getGender() {
//        return gender;
//    }

    public void setID(int id)
    {
        this.id=id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setGender(String gender) {
//        this.gender = gender;
//    }
    
        
}
