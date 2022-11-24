package com.digitalinnovationone.SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/helloWorld")
    public String helloMessage(){
        System.out.println("Sistema funcionando");
        return "Hello World Lucão";
    }
}
