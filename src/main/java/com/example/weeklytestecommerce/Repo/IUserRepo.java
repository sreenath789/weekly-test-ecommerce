package com.example.weeklytestecommerce.Repo;

import com.example.weeklytestecommerce.Model.Address;
import com.example.weeklytestecommerce.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
