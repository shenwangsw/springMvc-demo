package com.shen.mvc.controller.mapper;


import com.shen.mvc.controller.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
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
