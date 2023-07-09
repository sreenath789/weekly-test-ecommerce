package com.example.weeklytestecommerce.Service;

import com.example.weeklytestecommerce.Model.CartOrder;
import com.example.weeklytestecommerce.Repo.ICartOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartOrderService {

    @Autowired
    ICartOrderRepo iCartOrderRepo;

    public String addOrder(CartOrder cartOrder) {
        iCartOrderRepo.save(cartOrder);
        return "Order created";
    }

    public Optional<CartOrder> getOrderById(int id) {
        return iCartOrderRepo.findById(id);
    }
}
