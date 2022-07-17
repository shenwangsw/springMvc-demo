package com.shen.mvc.controller.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shen.mvc.controller.pojo.Adress;

import com.shen.mvc.controller.service.AddressService;
import com.shen.mvc.controller.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;

    @ResponseBody
    @RequestMapping(value = "/insertAddress")
    public String insertAddress(@RequestParam(value = "addressId", required = false, defaultValue = "0")
                                        String addressId,
                                @RequestParam("addressText") String addressText,
                                @RequestParam("consignee") String consignee,
                                @RequestParam("phone") String phone,
                                @RequestParam("userId") String userId
    ) throws JsonProcessingException {
        Adress adress = new Adress(Integer.parseInt(addressId) , consignee, phone, addressText);
        int i = addressService.insertAddress(adress, Integer.parseInt(userId));
        if (i > 0) {
            return "true";
        } else {
            return "false";
        }

    }

    @ResponseBody
    @RequestMapping(value = "/selectAddressById")
    public String selectAllAddress(HttpServletRequest request) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        HttpSession session = request.getSession();
        User users = (User) session.getAttribute("user");
        User newUser = addressService.selectAddressById(users.getUserId());
        System.out.println(users);
        String lists = mapper.writeValueAsString(newUser);
        return lists;
    }
    @ResponseBody
    @RequestMapping(value = "/upDateAddress")
    public String upDateAddress(Adress adress){
        System.out.println(adress);
        int i = addressService.upDateAddress(adress);

        if (i > 0) {
            return "true";
        } else {
            return "false";
        }

    }
    @ResponseBody
    @RequestMapping(value = "/deleteAddressById")
    public String deleteAddressById(@RequestParam("addressId") int addressId,HttpServletRequest request) {
        ObjectMapper mapper = new ObjectMapper();
        HttpSession session = request.getSession();
        User users = (User) session.getAttribute("user");
        int i = addressService.deleteAddress(addressId,users.getUserId());
        if (i > 0) {
            return "true";
        } else {
            return "false";
        }
    }
}
