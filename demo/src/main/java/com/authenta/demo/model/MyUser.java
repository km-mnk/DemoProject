package com.authenta.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="USER_TABLE")
@Data
public class MyUser {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private String id;
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
}