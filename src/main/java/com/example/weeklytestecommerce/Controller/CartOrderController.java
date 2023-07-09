package com.example.weeklytestecommerce.Controller;

import com.example.weeklytestecommerce.Model.CartOrder;
import com.example.weeklytestecommerce.Service.CartOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CartOrderController {

    @Autowired
    CartOrderService cartOrderService;

    @PostMapping("saveOrder")
    public String addOrder(@RequestBody CartOrder cartOrder){
        return cartOrderService.addOrder(cartOrder);
    }

    @GetMapping("orderById/{id}")
    public Optional<CartOrder> getOrderById(@PathVariable int id){
        return cartOrderService.getOrderById(id);
    }
}
