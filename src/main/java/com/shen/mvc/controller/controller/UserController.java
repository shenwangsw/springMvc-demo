package com.shen.mvc.controller.controller;

import com.shen.mvc.controller.pojo.User;
import com.shen.mvc.controller.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImp")
    private UserService userService;
    @Autowired
    private Validator validator;
    //查询所有人
    //@RequestMapping(value = "/getUserById",params = {"userName","userPassword"})
    @RequestMapping(value ="/checkUser")
//    String userName, String userPassword,
    public String getUserById(User user, HttpSession session, BindingResult result){
        System.out.println("我要验证用户名和密码");
//        int i = 1/0;
        this.validator.validate(user,result);
        if(result.hasErrors()){
            return "redirect:/login";
        }
        User users = userService.selectUser(user);
         session.setAttribute("user",users);
         System.out.println(users);
         System.out.println("密码正确");
         return "redirect:/index";
    }

    @RequestMapping(value = "/userCenter")
    public String UserCenter(){
        return "userCenter";
    }



}
