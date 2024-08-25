/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usertype.controller;

import com.example.usertype.entity.User;
import com.example.usertype.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rusira
 */
@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/users/clients")
    public List<User> getAllClients() {
        return userService.getAllClients();
    }

    @PostMapping(path = "/users")
    public User createUser(@RequestBody User user_tbl) {
        return userService.createUser(user_tbl);
    }

    @PostMapping(path = "/users/authenticate")
    public User authenticateUser(@RequestBody User user) {
        return userService.authenticate(user.getEmail(), user.getPassword());
    }

    @PutMapping(path = "/users")
    public User updateUser(@RequestBody User user_tbl) {
        return userService.updateUser(user_tbl);
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUserById(id);
    }
}
