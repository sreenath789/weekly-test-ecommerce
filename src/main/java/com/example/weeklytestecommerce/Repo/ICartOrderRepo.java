package com.example.weeklytestecommerce.Repo;

import com.example.weeklytestecommerce.Model.CartOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartOrderRepo extends CrudRepository<CartOrder,Integer> {
}
