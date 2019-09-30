package com.portal.feign.controller;

import com.portal.feign.service.LoginService;
import com.user.spi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login/{name}/{pwd}",method = RequestMethod.GET)
    public String login(@PathVariable String name,@PathVariable String pwd){
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);

        System.out.println(9095+"||"+user);
        return 9095+"||"+loginService.login(user);
    }
}
