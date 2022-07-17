package com.shen.mvc.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;//商品ID
    private String productName;//商品名称
    private String productPrice;//商品价格
    private String productImg;//商品图片地址
    private String productText;//商品介绍
}
