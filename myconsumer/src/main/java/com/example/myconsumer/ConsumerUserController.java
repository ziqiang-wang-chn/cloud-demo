package com.example.myconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerUserController {
    @Resource
    private OpenFeignClient openFeignClient;
    @GetMapping("/consumer")
    public String getUser() {
        return openFeignClient.getUser();
    }
}
