/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.usertype.service;

import com.example.usertype.entity.User;
import com.example.usertype.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rusira
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

     public List<User> getAllClients() {
         String type = "client";
        return  userRepository.findAllClients(type);
    }

   
    public User createUser(User user_tbl) {
        return userRepository.save(user_tbl);
    }

    public User updateUser(User user_tbl) {
        return userRepository.save(user_tbl);
    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    public User authenticate(String username, String password) {
        return userRepository.findByEmail(username,password);
    }

}
