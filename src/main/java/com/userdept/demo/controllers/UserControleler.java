package com.userdept.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdept.demo.entities.User;
import com.userdept.demo.exceptions.ResourceNotFoundException;
import com.userdept.demo.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserControleler {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }

    @PutMapping(value = "/{id}")
    public User change(@PathVariable Long id, @RequestBody User user) {
        User entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setDepartment(user.getDepartment());
        User result = repository.save(entity);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public User delete(@PathVariable Long id) {
        User user = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + id));
        repository.delete(user);
        return user;
    }
}
