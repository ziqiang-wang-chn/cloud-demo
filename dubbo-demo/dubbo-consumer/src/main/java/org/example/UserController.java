package org.example;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference
    private UserService userService;

    @GetMapping("/say/{param}")
    public String userSay(@PathVariable("param") String param) {
        return userService.sayHello(param);
    }
}
