package com.userdept.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userdept.demo.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
