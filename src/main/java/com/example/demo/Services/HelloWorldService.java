package com.example.demo.Services;

import com.example.demo.Modules.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {

    private List<Employee> employees = new ArrayList<>();

    public HelloWorldService() {
        employees.add(new Employee(1, "Arasan", "King"));
        employees.add(new Employee(2, "Guru", "Sipai"));
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    public List<Employee> getAllEmployees() {
        return employees;
    }


    public Employee getEmployeeById(int empID) {
        return employees.stream()
                .filter(emp -> emp.getEmpID() == empID)
                .findFirst()
                .orElse(null);
    }


    public boolean updateEmployee(int empID, Employee updatedEmp) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpID() == empID) {
                employees.set(i, updatedEmp);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int empID) {
        return employees.removeIf(emp -> emp.getEmpID() == empID);
    }
}