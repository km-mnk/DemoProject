package com.authenta.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.authenta.demo.model.MyUser;

@Repository
public interface UserRepository extends CrudRepository<MyUser, String>   
{  

}  