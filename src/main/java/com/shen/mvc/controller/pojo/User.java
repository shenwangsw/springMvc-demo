package com.shen.mvc.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
        private int userId;
        private String userName;
        private String userPassword;
        private String userEmail;
        private List<Adress> adressList;
}
