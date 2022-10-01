package com.authenta.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authenta.demo.exception.UserNotFounException;
import com.authenta.demo.model.MyUser;
import com.authenta.demo.repo.UserRepository;

@Service
public class UserService  {
    
    @Autowired    
    private UserRepository userRepository;
    private Long userName; 

    public List<MyUser> getAllUsers()  
    {    
        List<MyUser>userRecords = new ArrayList<>();    
        userRepository.findAll().forEach(userRecords::add);    
        return userRecords;    
    }

    public String addUser(MyUser user) {
        MyUser createdUser=userRepository.save(user);
        System.out.println(userRepository.findAll());
        return "user created with username : "+createdUser.getUserName();  
    }

    public Boolean loginUser(String username) {
        Boolean user= userRepository.findById(username).isEmpty()==true?false:true;
        return user;
    }

    public Optional<MyUser> getUser(String userId) throws UserNotFounException {
        Optional<MyUser> user=userRepository.findById(userId);
        if(user.isEmpty()){
            System.out.println("error occurred");
            throw new UserNotFounException("user not found");
        }

        return user;
    }

    public String deleteUser(String userName) {
        userRepository.deleteById(userName);
        Optional<MyUser> user=userRepository.findById(userName);
        if(user.isEmpty()){
            return "user not deleted";
        }
        return "user deleted";
    } 

}

