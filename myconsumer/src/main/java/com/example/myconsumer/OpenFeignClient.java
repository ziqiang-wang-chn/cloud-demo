package com.example.myconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider-service")
public interface OpenFeignClient {
    @GetMapping("/user")
    public String getUser() ;
}
