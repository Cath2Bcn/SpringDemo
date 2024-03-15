package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/myApp/")
public class MyRestController {

    @RequestMapping("/myrest")
    public String helloWorld(){
        return "Hello Worlds and class!!!!";
    }
}
