package com.qili.controller;

import com.qili.domain.User;
import com.qili.service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
@RequestMapping("/users")
public class UserJpaController {

    @Autowired
    private UserJpaService userJpaService;

    /**
     * 页面跳转的方法
     *
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }


    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(User user, Model model) {
        //添加用户
        this.userJpaService.save(user);
        //添加成功后查询用户列表并进行展示
        List<User> list = this.userJpaService.findAll();
        model.addAttribute("list", list);
        return "userList";
    }


    /**
     * 查询用户并进行展示
     */
    @RequestMapping("/queryAllUser")
    public String queryAllUser(Model model) {
        List<User> list = this.userJpaService.findAll();
        model.addAttribute("list", list);
        return "updateUserBefore";
    }


    /**
     * 根据ID查询用户并显示修改后的页面
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id, Model model) {
        User users = this.userJpaService.findUserById(id);
        model.addAttribute("users", users);
        return "updateUserAfter";
    }


    /**
     * 修改用户的方法
     */
    @RequestMapping("/updateUser")
    public String updateUser(User users, Model model) {
        // 修改用户信息
        this.userJpaService.updateUser(users);
        return "redirect:/users/queryAllUser";
    }

    /**
     * 删除用户的方法
     */

    @RequestMapping("/delUser")
    public String delUser(Integer id) {
        this.userJpaService.delUser(id);
        return "redirect:/users/queryAllUser";
    }

    @GetMapping("/testAddBranch")
    public void testAddBranch(){
        System.out.println("我是测试新增的分支方法修改前！");
        System.out.println("我是测试master合并的代码！");
    }
}
