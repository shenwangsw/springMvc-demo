package com.shen.mvc.controller.service.Imp;

import com.shen.mvc.controller.mapper.OrderMapper;
import com.shen.mvc.controller.pojo.Order;
import com.shen.mvc.controller.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    public Order selectOrderById(int id) {
        return orderMapper.selectOrderById(id);
    }

    public List<Order> selectAllOrder() {
        return orderMapper.selectAllOrder();
    }

    public int upDateOrder(Order order, int id) {
        return 0;
    }

    public int deleteOrder(int id) {
        return orderMapper.deleteOrder(id);
    }
}
