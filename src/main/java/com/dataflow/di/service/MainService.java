package com.dataflow.di.service;

import com.dataflow.di.dao.MainDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Resource
    private MainDao dao;

    public String homePageInfo() {
        return dao.findInfo();
    }
}
