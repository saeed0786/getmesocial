package com.example.getmesocial.service;
import com.example.getmesocial.model.User;

import com.example.getmesocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /*
    public User getUser() {
        return userRepository.getUser();
    }


 public User saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int userId) {
        return userRepository.getuserById(userId);
    }

    public User updateUser(int userId, User user) {
     return userRepository.updateUser(userId, user);
    }

    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }
    */
}