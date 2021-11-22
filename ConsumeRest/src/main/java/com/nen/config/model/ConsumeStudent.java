package com.nen.config.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
public class ConsumeStudent {

//    @Id
    private int id;
    private String username;
    private String email;
    private String password;
    private String country;
    private String gender;
    private int age;


}