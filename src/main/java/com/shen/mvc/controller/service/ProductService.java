package com.shen.mvc.controller.service;

import com.shen.mvc.controller.pojo.Product;

import java.util.List;

public interface ProductService {
    //增删改查
    //增加产品
    int insertProduct(Product product);
    //根据Id查询商品
    Product selectProductById(int id);
    //查询所有商品
    List<Product> selectAllProduct();
    //根据产品id修改产品
    int upDateProduct(int id);
    //根据id删除商品
    int deleteProduct(int id);
}
