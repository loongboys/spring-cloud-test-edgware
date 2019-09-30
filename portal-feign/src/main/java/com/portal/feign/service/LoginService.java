package com.portal.feign.service;

import com.portal.feign.hystrix.LoginServiceHystrix;
import com.user.spi.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-zuul",fallback = LoginServiceHystrix.class)
public interface LoginService {

    @RequestMapping(value = "/user/user/login",method = RequestMethod.GET)//zuul过滤之后会截取一个，所以写两个
//    @RequestMapping(value = "/user/login",method = RequestMethod.GET)
    public String login(User user);
}
