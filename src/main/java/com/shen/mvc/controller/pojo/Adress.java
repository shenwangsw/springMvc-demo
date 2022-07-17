package com.shen.mvc.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    private int addressId;
    private String consignee;
    private String phone ;
    private String addressText;
}
