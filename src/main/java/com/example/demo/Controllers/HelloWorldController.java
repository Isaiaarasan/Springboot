package com.example.demo.Controllers;

import com.example.demo.Modules.Employee;
import com.example.demo.Services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")  // IMPORTANT FIX
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return helloWorldService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return helloWorldService.getEmployeeById(id);
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        helloWorldService.addEmployee(employee);
        return "Employee added successfully!";
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        boolean updated = helloWorldService.updateEmployee(id, employee);
        return updated ? "Employee updated!" : "Employee not found!";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        boolean deleted = helloWorldService.deleteEmployee(id);
        return deleted ? "Employee deleted!" : "Employee not found!";
    }
}
