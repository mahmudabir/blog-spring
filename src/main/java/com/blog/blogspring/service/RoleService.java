package com.blog.blogspring.service;

import com.blog.blogspring.entity.Role;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.repository.RoleRepository;
import com.blog.blogspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    public Role getRole(int roleId) {
        return roleRepository.findById(roleId).get();
    }

    public List<Role> getAllRoles() {
        List<Role> roles = new ArrayList<>();
        roleRepository.findAll()
                .forEach(roles::add);
        return roles;
    }

    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    public void addRole(Role role) {
        roleRepository.save(role);
    }

    public void removeRole(int roleId) {
        roleRepository.deleteById(roleId);
    }

    public void addAdmin(User user){
        user.setRole(new Role(1,""));
        userRepository.save(user);
    }

    public void updateAdmin(int userId, User user) {
        user.setId(userId);
        userRepository.save(user);
    }

    public void removeAdmin(int userId) {
        userRepository.deleteById(userId);
    }
}
