package com.github.comctrl.dubbo.provider.service;

import com.github.comctrl.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hehe， " + name;
    }
}