package com.github.comctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘彦硕
 * @Description TODO
 * @Date 2020/1/6 2:52 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class AlandProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlandProviderApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
