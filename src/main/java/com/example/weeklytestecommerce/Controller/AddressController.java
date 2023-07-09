package com.example.weeklytestecommerce.Controller;

import com.example.weeklytestecommerce.Model.Address;
import com.example.weeklytestecommerce.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("saveAddress")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}
