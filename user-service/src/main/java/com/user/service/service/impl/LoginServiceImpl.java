package com.user.service.service.impl;

import com.user.spi.service.LoginService;
import com.user.spi.dto.User;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public String login(User user) throws Exception {
        System.out.println("9081"+user);
        return "9081"+"||"+user.toString();
    }
}
