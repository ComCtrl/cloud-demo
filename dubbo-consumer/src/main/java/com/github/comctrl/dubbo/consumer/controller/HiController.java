package com.github.comctrl.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘彦硕
 * @Description TODO
 * @Date 2019/12/25 4:40 下午
 */
@RestController
public class HiController {
    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("Dubbo!");
    }
}
