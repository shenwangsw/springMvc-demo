package com.shen.mvc.controller.mapper;

import com.shen.mvc.controller.pojo.Adress;
import com.shen.mvc.controller.pojo.Condiment;

import com.shen.mvc.controller.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.jws.WebParam;
import java.util.List;
@Repository
public interface AddressMapper {
    //增删改查
    //增加地址
    int insertAddress(Adress adress);
    //根据用户Id查询地址
    User selectAddressById(@Param("userId") int id);
    //查询所有商品
    List<Adress> selectAllAddress();
    //根据用户id修改地址
    int upDateAddress(Adress adress);
    //根据id删除地址
    int deleteAddress(@Param("addressId")int id);
}
