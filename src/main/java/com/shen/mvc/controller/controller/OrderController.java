package com.shen.mvc.controller.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shen.mvc.controller.Converter.OrderConverter;
import com.shen.mvc.controller.pojo.Order;
import com.shen.mvc.controller.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController  {
    @Autowired
private OrderService orderService;


    @RequestMapping(value = "/orderCenter")
    public String UserCenter(){
        return "orderCenter";
    }
    @ResponseBody
    @RequestMapping(value = "insertOrder")
    public String insertOrder(@RequestParam("orderInfo") String orderInfo,
                              @RequestParam("orderPrice") String orderPrice,
                              @RequestParam("orderTime") String orderTime ,
                              @RequestParam(value = "orderId",required = false,defaultValue = "0") int orderId
                              ) {
        OrderConverter orderConverter = new OrderConverter();
        Date date = orderConverter.convert(orderTime);
         Order order = new Order(orderId,Float.parseFloat(orderPrice),date,orderInfo);
        int i = orderService.insertOrder(order);
        if(i>0){
         return "true";
        }
        else {
            return "false";
        }
    }
    @ResponseBody
    @RequestMapping(value = "selectOrderById")
    public String selectOrderById(@RequestParam("orderId")int id) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
       Order order = orderService.selectOrderById(id);
        return mapper.writeValueAsString(order);
    }
    @ResponseBody
    @RequestMapping(value = "selectAllOrder")
    public String selectAllOrder() throws Exception{
        List list = orderService.selectAllOrder();
        ObjectMapper Mapper = new ObjectMapper();
        String lists = Mapper.writeValueAsString(list);
        return lists;
    }
    @ResponseBody
    @RequestMapping(value = "upDateOrder")
    public int upDateOrder(Order order, @RequestParam("orderId")int id) {
        return 0;
    }
    @ResponseBody
    @RequestMapping(value = "deleteOrder")
    public String  deleteOrder(@RequestParam("orderId")int id) {
        int i = orderService.deleteOrder(id);
        if(i>0){
            return "yes";
        }
        else {
            return "no";
        }
    }
}
