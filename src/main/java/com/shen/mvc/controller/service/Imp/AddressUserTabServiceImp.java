package com.shen.mvc.controller.service.Imp;

import com.shen.mvc.controller.mapper.AddressUserTabMapper;
import com.shen.mvc.controller.service.AddressUserTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressUserTabServiceImp implements AddressUserTabService {
    @Autowired
    private AddressUserTabMapper addressUserTabMapper;
    public int insertAddressUser(int addressId, int userId) {
        return addressUserTabMapper.insertAddressUser(addressId,userId);
    }

    public int deleteAddressUser(int addressId, int userId) {
        return addressUserTabMapper.deleteAddressUser(addressId,userId);
    }
}
