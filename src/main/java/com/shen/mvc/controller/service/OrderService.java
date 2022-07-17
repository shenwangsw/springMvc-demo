package com.shen.mvc.controller.service;

import com.shen.mvc.controller.pojo.Order;

import java.util.List;

public interface OrderService {
    //增删改查
    //增加订单
    int insertOrder(Order order);
    //根据Id查询订单
    Order selectOrderById(int id);
    //查询所有订单
    List<Order> selectAllOrder();
    //根据产品id修改产品
    int upDateOrder(Order order,int id);
    //根据id删除商品
    int deleteOrder(int id);
}
