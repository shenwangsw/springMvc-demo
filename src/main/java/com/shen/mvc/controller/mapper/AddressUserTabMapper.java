package com.shen.mvc.controller.mapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressUserTabMapper {
    //添加地址中间表记录
    int insertAddressUser(@Param("addressId") int addressId,@Param("userId")int userId);
    //删除中间表地址记录
    int deleteAddressUser(@Param("addressId") int addressId,@Param("userId")int userId);
}
