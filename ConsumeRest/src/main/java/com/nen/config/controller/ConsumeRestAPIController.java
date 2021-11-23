package com.nen.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumeRestAPIController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/getAllStudents")
    public String allStudentsListPage(){

//        RestTemplate restTemplate = this.restTemplate.getForObject();

        return "";
    }

}
