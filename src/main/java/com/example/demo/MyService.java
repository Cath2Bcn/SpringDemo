package com.example.demo;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;

import java.util.Date;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;


@Service
public class MyService {

    static ArrayList<MySimulation> simulations = new ArrayList<>();

    static {

        // locale in english
        Faker faker = new Faker(new Locale("en-GB"));
        Date date = new Date();

        // ref variable creation UUID
        String uniqueID;

        for (int i = 0; i <10 ; i++ ){

            uniqueID = UUID.randomUUID().toString();
            simulations.add(
                    new MySimulation ( uniqueID,
                            date,
                            faker.number().numberBetween(100, 1250),
                            faker.artist().name() ));
        }

    }

    // return simulations to controller
    // get simulations form list static from class and return as signature
    public ArrayList<MySimulation> getAllSimulations (){
        return simulations;
    }

}