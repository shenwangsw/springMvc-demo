package com.shen.mvc.controller.service.Imp;

import com.shen.mvc.controller.mapper.ProductMapper;
import com.shen.mvc.controller.pojo.Product;
import com.shen.mvc.controller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements   ProductService {
    @Autowired
 private ProductMapper productMapper;
    public int insertProduct(Product product) {
        return 0;
    }

    public Product selectProductById(int id) {
        return null;
    }

    public List<Product> selectAllProduct() {
        return productMapper.selectAllProduct();
    }

    public int upDateProduct(int id) {
        return 0;
    }

    public int deleteProduct(int id) {
        return 0;
    }
}
