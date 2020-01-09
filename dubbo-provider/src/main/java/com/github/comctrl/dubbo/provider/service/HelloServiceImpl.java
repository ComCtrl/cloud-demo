package com.github.comctrl.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "你好，Hello " + name;
    }
}