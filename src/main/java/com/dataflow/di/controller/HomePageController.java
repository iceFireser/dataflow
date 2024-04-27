package com.dataflow.di.controller;

import com.dataflow.di.service.MainService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomePageController {


    @Resource
    private MainService service;

    @RequestMapping("/world")
    public String Hello(){

        return service.homePageInfo();
    }
}
