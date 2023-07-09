package com.example.weeklytestecommerce.Repo;

import com.example.weeklytestecommerce.Model.Address;
import com.example.weeklytestecommerce.Model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
    @Query("select al from Product al where al.category=?1")
    List<Product> getAllProductsByCategory(String category);
}
