package com.user.service.controller;


import com.user.spi.service.LoginService;
import com.user.spi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestBody User user) throws Exception{
        return loginService.login(user);
    }
}
