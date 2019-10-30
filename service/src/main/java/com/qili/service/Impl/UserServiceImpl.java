package com.qili.service.Impl;

import com.qili.domain.User;
import com.qili.repository.UserRepository;
import com.qili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    
    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }
}
