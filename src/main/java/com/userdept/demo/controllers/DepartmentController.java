package com.userdept.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userdept.demo.entities.Department;
import com.userdept.demo.exceptions.ResourceNotFoundException;
import com.userdept.demo.repositories.DepartmentRepository;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public List<Department> findAll() {
        List<Department> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id) {
        Department result = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department not found with ID: " + id));
        return result;
    }

    @PostMapping
    public Department insert(@RequestBody Department department) {
        Department result = repository.save(department);
        return result;
    }
}
