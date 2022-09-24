package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService  {
    
    @Autowired    
    private UserRepository userRepository; 

    public List<User> getAllUsers()  
    {    
        List<User>userRecords = new ArrayList<>();    
        userRepository.findAll().forEach(userRecords::add);    
        return userRecords;    
    }

    public String addUser(User user) {
        User createdUser=userRepository.save(user);
        return "user created with username : "+createdUser.getUserName();  
    }

    public Boolean loginUser(String username) {
        Optional<User> user=userRepository.findById(username);
        if(user!=null){
            return true;
        }
        return false;
    }

    public Optional<User> getUser(String userName) {
        Optional<User> user=userRepository.findById(userName);
        return user;
    }

    public String deleteUser(String userName) {
        userRepository.deleteById(userName);
        Optional<User> user=userRepository.findById(userName);
        if(user!=null){
            return "user not deleted";
        }
        return "user deleted";
    } 

}

