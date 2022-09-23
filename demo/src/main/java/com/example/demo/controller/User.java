package com.example.demo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Table")
public class User {
    @Id
    @Column(name = "UserName")
    String userName;
    @Column(name="Password")
    String password;
}
