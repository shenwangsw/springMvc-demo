package com.shen.mvc.controller.service.Imp;

import com.shen.mvc.controller.mapper.UserMapper;
import com.shen.mvc.controller.pojo.User;
import com.shen.mvc.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    public int insertUser() {
        return 0;
    }
    public User selectUser(User user) {
        return userMapper.selectUser(user);
    }

    public User selectUserById(int userId) {
        return userMapper.selectUserById(userId);
    }

    public List<User> selectAllUser() {
        return null;
    }

    public int deleteUser() {
        return 0;
    }

    public int updateUser() {
        return 0;
    }
}
