package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/myrest")
    public String helloWorld(){

        return "Hello Worlds and class!!!!";
    }
}
