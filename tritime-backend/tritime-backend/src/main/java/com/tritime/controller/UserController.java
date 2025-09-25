package com.tritime.controller;

import com.tritime.model.User;
import com.tritime.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // URL base para esse controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // --- Criar novo usuário ---
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // --- Listar todos os usuários ---
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // --- Buscar usuário por ID ---
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}
