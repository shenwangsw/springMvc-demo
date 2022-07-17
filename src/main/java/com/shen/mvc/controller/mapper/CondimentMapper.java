package com.shen.mvc.controller.mapper;

import com.shen.mvc.controller.pojo.Condiment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CondimentMapper {
    //增删改查
    //增加产品
    int insertCondiment(Condiment condiment);
    //根据Id查询商品
    Comparable selectCondimentById(int id);
    //查询所有商品
    List<Condiment> selectAllCondiment();
    //根据产品id修改产品
    int upDateCondiment(int id);
    //根据id删除商品
    int deleteCondiment(int id);
}
