package com.shen.mvc.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressUserTab {
    private int id;
    private int userId;
    private int addressId;

}
