package com.blog.blogspring.service;

import com.blog.blogspring.entity.Role;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(int userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public void updateUser(int userId, User user) {
        user.setId(userId);
        userRepository.save(user);
    }

    public void addUser(User user) {
        user.setRole(new Role(2, ""));
        userRepository.save(user);
    }

    public void removeUser(int userId) {
        userRepository.deleteById(userId);
    }
}
