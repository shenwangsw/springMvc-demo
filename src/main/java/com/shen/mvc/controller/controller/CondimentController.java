package com.shen.mvc.controller.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shen.mvc.controller.service.CondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CondimentController {
    @Autowired
    @Qualifier("condimentServicImp")
    private CondimentService condimentService;
    @RequestMapping(value = "/getAllCondiment")
    public String getAllCondiment() throws Exception{
        List list = condimentService.selectAllCondiment();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(list);
    }
}
