package com.shen.mvc.controller.service;

import com.shen.mvc.controller.pojo.User;

import java.util.List;

public interface UserService {
    //添加用户
    int insertUser();
    //通过用户名和密码查找用户
    User selectUser(User user);
    //查找用户
    User selectUserById(int userId);
    //查找所有用户
    List<User> selectAllUser();
    //删除用户
    int deleteUser();
    //修改用户信息
    int updateUser();
}
