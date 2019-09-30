package com.user.service.controller;


import com.user.spi.service.UserService;
import com.user.spi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/create",method = RequestMethod.POST)
    public int create(@RequestBody User user) throws Exception{
        return userService.create(user);
    }
}
