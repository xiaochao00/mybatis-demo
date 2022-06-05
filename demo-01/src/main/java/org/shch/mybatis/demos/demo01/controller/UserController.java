package org.shch.mybatis.demos.demo01.controller;

import org.shch.mybatis.demos.demo01.dao.UserMapper;
import org.shch.mybatis.demos.demo01.model.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shichao
 * @since 2022/06/05 17:23
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("list")
    private List<UserPo> userList() {
        System.out.println("Begin query user list...");
        List<UserPo> userList = userMapper.queryList();
        System.out.println("Success get user list count:" + userList.size());
        return userList;
    }
}
