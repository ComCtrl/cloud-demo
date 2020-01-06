package com.github.comctrl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 刘彦硕
 * @Description TODO
 * @Date 2020/1/6 3:07 下午
 */
@FeignClient(value = "aland-provider")
public interface HiService {
    @GetMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}
