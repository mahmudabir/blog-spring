package com.blog.blogspring.controller;


import com.blog.blogspring.entity.Role;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.service.RoleService;
import com.blog.blogspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;


//    @GetMapping("")
//    public List<Role> getAllRoles() {
//        return roleService.getAllRoles();
//    }
//
//    @PostMapping("")
//    public void addUser(@RequestBody Role role) {
//        roleService.addRole(role);
//    }
//
//    @GetMapping("/{roleId}")
//    public Role getUser(@PathVariable int roleId) {
//        return roleService.getRole(roleId);
//    }
//
//    @PutMapping("/{roleId}")
//    public void updateUser(@PathVariable int roleId, @RequestBody User user) {
//        roleService.updateRole(user);
//    }
//
//    @DeleteMapping("/{roleId}")
//    public void removeUser(@PathVariable int userId) {
//        roleService.removeRole(userId);
//    }

    @PostMapping("/admins")
    public void addAdmin(@RequestBody User user) {
        roleService.addAdmin(user);
    }

    @PutMapping("/admins/{userId}")
    public void updateUser(@RequestBody User user, @PathVariable int userId) {
        roleService.updateAdmin(userId, user);
    }

    @PostMapping("/admins/{userId}")
    public void removeAdmin(@PathVariable int userId) {
        roleService.removeAdmin(userId);
    }

}
