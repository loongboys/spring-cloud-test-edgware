package com.user.service.service.impl;

import com.user.service.entity.UserEntity;
import com.user.service.repository.UserRepository;
import com.user.service.service.IdService;
import com.user.spi.service.UserService;
import com.user.spi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    IdService idService;

    @Override
    public int create(User user) throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(idService.getNoSeqId());
        userEntity.setName(user.getName());
        userEntity.setPassword(user.getPwd());
        try {
            userRepository.save(userEntity);
            return 1;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public int update(Long id, User user) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id, User user) throws Exception {
        return 0;
    }

    @Override
    public User findById(Long i) throws Exception {
        return null;
    }

    @Override
    public List<User> find(User user) throws Exception {
        return null;
    }
}
