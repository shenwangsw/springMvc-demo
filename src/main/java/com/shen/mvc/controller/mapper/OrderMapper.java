package com.shen.mvc.controller.mapper;

import com.shen.mvc.controller.pojo.Adress;
import com.shen.mvc.controller.pojo.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderMapper {
    //增删改查
    //增加订单
    int insertOrder(Order order);
    //根据Id查询订单
    Order selectOrderById(@Param("orderId") int id);
    //查询所有订单
    List<Order> selectAllOrder();
    //根据产品id修改产品
    int upDateOrder(Order order,@Param("orderId") int id);
    //根据id删除商品
    int deleteOrder(@Param("orderId")int id);
}
