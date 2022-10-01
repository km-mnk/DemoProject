package com.authenta.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/authenta")
public class CustomerController {

    @GetMapping("/nonce")
    public String getAuthToken(){
        return  "auth token";

    }

    
    
}
