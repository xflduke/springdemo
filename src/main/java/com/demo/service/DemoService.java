package com.demo.service;

import com.demo.mapper.DemoMapper;
import com.demo.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoMapper demoMapper;

    public boolean save(Demo demo){
        return demoMapper.save(demo);
    }

    public Demo getById(Long id){
        return demoMapper.getById(id);
    }

    public List<Demo> list(){
        return demoMapper.list();
    }
}
