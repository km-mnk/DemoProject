package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MyUser;

@Repository
public interface UserRepository extends CrudRepository<MyUser, String>   
{  

}  