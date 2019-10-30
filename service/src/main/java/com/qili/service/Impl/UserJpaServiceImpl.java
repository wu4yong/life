package com.qili.service.Impl;

import com.qili.domain.User;
import com.qili.repository.UserJpaRepository;
import com.qili.service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJpaServiceImpl implements UserJpaService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return userJpaRepository.getOne(id);
    }

    @Override
    public void updateUser(User users) {
        userJpaRepository.save(users);
    }

    @Override
    public void delUser(Integer id) {
        userJpaRepository.deleteById(id);
    }
}
