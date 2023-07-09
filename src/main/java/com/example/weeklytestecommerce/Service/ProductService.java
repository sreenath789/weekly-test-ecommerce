package com.example.weeklytestecommerce.Service;

import com.example.weeklytestecommerce.Model.Product;
import com.example.weeklytestecommerce.Repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public String addProducts(List<Product> productList) {
        iProductRepo.saveAll(productList);
        return "Products Added";
    }

    public List<Product> getAllProductsByCategory(String category) {
        return iProductRepo.getAllProductsByCategory(category);
    }

    public String deleteProductById(int id) {
        if(iProductRepo.existsById(id)){
            iProductRepo.deleteById(id);
            return "Deleted";
        }
        else{
            return "Product Id not found";
        }
    }
}
