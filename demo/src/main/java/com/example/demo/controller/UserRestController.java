package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class UserRestController {
    @GetMapping("/login/{id}")
    public String getMethod(@PathParam("id") String userName){
        return "get test";
    }

    @PostMapping("/signup")
    public String postMethod(@RequestBody User user){
        System.out.println("user name is: "+user.userName);
        System.out.println("user password: "+user.password);
        return "post test";
    }

    @PutMapping("/put")
    public String putMethod(){
        return "post test";
    }

    @DeleteMapping("/delete")
    public String deleteMethod(){
        return "post test";
    }


    
}
