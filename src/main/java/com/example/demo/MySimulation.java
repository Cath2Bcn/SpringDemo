package com.example.demo;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class MySimulation {

    @Id
    private String id;
    private Date createdAt;
    private int timeElapsed;
    private String userName;
}
