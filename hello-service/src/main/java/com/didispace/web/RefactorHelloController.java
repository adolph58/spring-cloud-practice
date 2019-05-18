package com.didispace.web;

import com.didispace.dto.User;
import com.didispace.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 程江涛 on 2019/5/13.
 */
@RestController
public class RefactorHelloController implements HelloService{

    @Override
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
