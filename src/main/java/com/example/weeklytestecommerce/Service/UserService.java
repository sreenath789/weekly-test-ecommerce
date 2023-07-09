package com.example.weeklytestecommerce.Service;

import com.example.weeklytestecommerce.Model.User;
import com.example.weeklytestecommerce.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUsers(List<User> userList) {
        iUserRepo.saveAll(userList);
        return "Users Added";
    }

    public Optional<User> getUserById(int id) {
        return iUserRepo.findById(id);
    }
}
