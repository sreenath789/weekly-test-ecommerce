package com.example.weeklytestecommerce.Repo;

import com.example.weeklytestecommerce.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
