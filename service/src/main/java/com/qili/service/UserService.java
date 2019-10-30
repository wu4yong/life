package com.qili.service;

import com.qili.domain.User;
import com.qili.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {

    //保存用户
     boolean save(User user);

}
