package org.example;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@DubboService
public class UserServiceImpl implements UserService{
    public String sayHello(String param) {
        return "provider => param : " + param;
    }
}
