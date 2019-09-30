package com.user.spi.service;

import com.user.spi.dto.User;

import java.util.List;

/**
 * USER用户接口
 */
public interface UserService {

    int create(User user) throws Exception;

    int update(Long id,User user) throws Exception;

    int delete(Long id,User user) throws Exception;
    User findById(Long i) throws Exception;
    List<User> find(User user)  throws Exception;

}
