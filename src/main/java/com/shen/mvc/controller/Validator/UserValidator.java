package com.shen.mvc.controller.Validator;

import com.shen.mvc.controller.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {

        User user = (User) target;
        ValidationUtils.rejectIfEmpty(errors,"userName",null,"用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors,"userPassword",null,"密码不能为空");
        if (user.getUserPassword().length()<6){
            errors.rejectValue("userPassword","密码小于6位");
        }
    }
}
