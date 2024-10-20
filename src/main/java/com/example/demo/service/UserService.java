package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }


    public User registerUser(User user) {
        return userRepo.save(user);
    }

    public User deleteUser(Long id) {
        return userRepo.findById(id)
                .orElse(new User());
    }

}
