package com.user.spi.service;

import com.user.spi.dto.User;

public interface LoginService {
    String login(User user) throws Exception;
}
