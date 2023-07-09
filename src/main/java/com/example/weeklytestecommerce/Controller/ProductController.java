package com.example.weeklytestecommerce.Controller;

import com.example.weeklytestecommerce.Model.Product;
import com.example.weeklytestecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("saveProducts")
    public String addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("productsByCategory/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable String category){
        return productService.getAllProductsByCategory(category);
    }

    @DeleteMapping("deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }
}
