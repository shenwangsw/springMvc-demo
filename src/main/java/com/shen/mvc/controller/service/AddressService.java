package com.shen.mvc.controller.service;

import com.shen.mvc.controller.pojo.Adress;
import com.shen.mvc.controller.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressService {
    //增删改查
    //增加地址
    int insertAddress(Adress adress,int userId);
    //根据Id查询地址
    User selectAddressById(int id);
    //查询所有地址
    List<Adress> selectAllAddress();
    //根据产品id修改地址
    int upDateAddress(Adress adress);
    //根据id删除地址
    int deleteAddress(int addressId,int userId);
}
