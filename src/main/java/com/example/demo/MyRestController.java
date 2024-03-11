package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

@RestController
public class MyRestController {

    @GetMapping("/myrest")
    public String helloWorld(){
        return "Hello Worlds and class!!!!";
    }

    @Autowired
    MyService simulationService;

    @RequestMapping("/simulations")
    public ArrayList<MySimulation> getAllSimulations (){
        return simulationService.getAllSimulations();
    }
}
