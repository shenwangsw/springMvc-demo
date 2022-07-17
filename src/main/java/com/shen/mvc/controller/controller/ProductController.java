package com.shen.mvc.controller.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shen.mvc.controller.pojo.Product;
import com.shen.mvc.controller.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    @Qualifier("productServiceImp")
    private ProductService productService;
    @ResponseBody
    @RequestMapping(value = "/getAllProduct")
   public String selectProductAll() throws JsonProcessingException {
        System.out.println("获取所有商品信息");
        ObjectMapper mapper = new ObjectMapper();
        List<Product> list =productService.selectAllProduct();
        return  mapper.writeValueAsString(list);
}}
