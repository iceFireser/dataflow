package com.dataflow.di.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomePageController {

    @RequestMapping("/world")
    public String Hello(){
        return "hello world!";
    }
}
