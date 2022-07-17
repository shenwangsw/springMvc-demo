package com.shen.mvc.controller.service;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressUserTabService {
    //添加地址中间表记录
    int insertAddressUser(int addressId,int userId);
    //删除中间表地址记录
    int deleteAddressUser(int addressId,int userId);
}
