package com.qili.service;

import com.qili.domain.User;

import java.util.List;

/**
 * JpaService 接口
 */
public interface UserJpaService {
    User save(User user);

    User findUserById(Integer id);

    List<User> findAll();

    void updateUser(User users);

    void delUser(Integer id);
}
