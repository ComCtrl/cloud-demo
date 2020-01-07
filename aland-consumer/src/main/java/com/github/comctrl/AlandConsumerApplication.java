package com.github.comctrl;

import com.github.comctrl.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘彦硕
 * @Description TODO
 * @Date 2020/1/6 3:01 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class AlandConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlandConsumerApplication.class, args);
    }

    @Autowired
    private HiService hiService;

    @GetMapping("test")
    public String test(@RequestParam(value = "name") String name, HttpServletRequest request){
        return "当前ip地址：" + request.getLocalAddr()  + ", 返回的内容是:"  + hiService.hi(name);
    }
}
