package com.shen.mvc.controller.service.Imp;


import com.shen.mvc.controller.mapper.CondimentMapper;
import com.shen.mvc.controller.pojo.Condiment;
import com.shen.mvc.controller.service.CondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CondimentServicImp implements CondimentService {
    @Autowired
    private CondimentMapper condimentMapper;
    public int insertCondiment(Condiment condiment) {
        return 0;
    }

    public int selectCondimentById(int id) {
        return 0;
    }

    public List<Condiment> selectAllCondiment() {
        return condimentMapper.selectAllCondiment();
    }

    public int upDateCondiment(int id) {
        return 0;
    }

    public int deleteCondiment(int id) {
        return 0;
    }




}
