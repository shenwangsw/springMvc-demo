package com.shen.mvc.controller.mapper;

import com.shen.mvc.controller.pojo.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

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
