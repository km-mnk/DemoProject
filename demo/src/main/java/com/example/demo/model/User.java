package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="USER_TABLE")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private long id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @NotBlank(message = "UserName is mandatory")
    @Column(name = "UserName")
    private String userName;

    @Column(name="Password")
    private String password;

    @Column(name="Email")
    @Email(message = "improper Email")
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