package com.example.demo.repository;

import com.example.demo.Modules.Employee;
import org.springframework.Jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();

    void save(Employee employee);

    void deleteById(int id);

    Optional<Object> findById(int id);
}
