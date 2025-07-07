package com.example.demo.repository;

import com.example.demo.Modules.Employee;
import org.springframework.data.Jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
