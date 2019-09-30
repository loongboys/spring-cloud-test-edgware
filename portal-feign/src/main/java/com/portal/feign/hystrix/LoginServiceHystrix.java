package com.portal.feign.hystrix;

import com.portal.feign.service.LoginService;
import com.user.spi.dto.User;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceHystrix implements LoginService {

    @Override
    public String login(User user) {
        return "error"+user.toString();
    }
}
