package com.example.firstmicroservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiOne")
public class Controller {

    @GetMapping("/getFromFirst")
    public String get(){

        return "Microservice-One";
    }
}
