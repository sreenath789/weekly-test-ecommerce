package com.example.weeklytestecommerce.Service;

import com.example.weeklytestecommerce.Model.Address;
import com.example.weeklytestecommerce.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address address) {
        iAddressRepo.save(address);
        return "Address Added";
    }
}
