package com.example.demo.controller;

import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/demo")
public class UserRestController {


    @GetMapping("/login/{id}")
    public String getMethod(@PathParam("id") String userName){
        return "get test";
    }

    @PostMapping("/signup")
    public String postMethod(@RequestBody User user,@RequestParam String testName){
        System.out.println("user name is: "+user.getUserName());
        System.out.println("user password: "+user.getPassword());
        return "post test";
    }

    @PutMapping("/put")
    public String putMethod(@RequestBody User user){
        System.out.println("user name is: "+user.getUserName());
        System.out.println("user password: "+user.getPassword());
        return "put test";
    }

    @DeleteMapping("/delete/{username}")
    public String deleteMethod(@PathParam("username") String  userName){   
        return "delete test";
    }   

}
