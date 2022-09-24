package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User {
    @Id
    @Column(name = "UserName")
    private String userName;
    @Column(name="Password")
    private String password;
    @Column(name="Email")
    private String email;
    @Column(name="Salary")
    private int salary;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }  

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }  

    
}