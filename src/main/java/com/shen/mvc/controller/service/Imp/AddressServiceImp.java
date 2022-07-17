package com.shen.mvc.controller.service.Imp;

import com.shen.mvc.controller.mapper.AddressMapper;
import com.shen.mvc.controller.pojo.Adress;
import com.shen.mvc.controller.pojo.User;
import com.shen.mvc.controller.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AddressServiceImp implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private AddressUserTabServiceImp addressUserTabServiceImp;
    @Transactional
    public int insertAddress(Adress adress,int userId) {
        int i = addressMapper.insertAddress(adress);
        addressUserTabServiceImp.insertAddressUser(adress.getAddressId(),userId);
        return i;
    }
    public User selectAddressById(int id) {
        return addressMapper.selectAddressById(id);
    }

    public List<Adress> selectAllAddress() {
        return addressMapper.selectAllAddress();
    }

    public int upDateAddress(Adress adress) {
        return addressMapper.upDateAddress(adress);
    }

    @Transactional
    public int deleteAddress(int addressId,int userId) {
        int is =addressUserTabServiceImp.deleteAddressUser(addressId,userId);
        int i = addressMapper.deleteAddress(addressId);
        return i;
    }
}
