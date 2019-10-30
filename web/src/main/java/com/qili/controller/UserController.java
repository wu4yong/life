package com.qili.controller;

import com.qili.domain.User;
import com.qili.repository.UserRepository;
import com.qili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * 标题: 用户 REST 接口<br>
 * 描述: RESTFul 格式<br>
 *
 * @author zc
 * @date 2018/04/08
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/person/save")
    public User save(@RequestParam String username) {
        User user = new User();
        user.setUserName(username);
        if (userService.save(user)) {
            System.out.printf("用户对象： %s 保存成功\n", user);
        }
        return user;
    }

    @RequestMapping(value = "/person/info", method = RequestMethod.GET)
    public String list(@RequestParam String name, @RequestParam int age) {

        return "姓名：" + name + "" + "年龄：" + age;
    }
}
