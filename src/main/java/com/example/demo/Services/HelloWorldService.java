package com.example.demo.Services;

import com.example.demo.Modules.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {



    List<Employee> emp =new ArrayList<>(
            Arrays.asList(new Employee(1,"arasan","King"),
                    new Employee(2,"Guru","Sipai"))
    );

    public List<Employee> getEmp() {
        return emp;
    }



        List<Employee> employees = new ArrayList<>();

        public Employee getEmployeeById(int empID) {
            int index = -1;

            for (int i = 0; i < employees.size(); i++) {
                if (empID == employees.get(i).getEmpID()) {
                    System.out.println("Employee Found: " + employees.get(i).getEmpID());
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                return employees.get(index);
            } else {
                System.out.println("Employee Not Found!");
                return null;
            }
        }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    public String getMethod(){
        return "Get Method";
    }
    public String postMethod(){
        return "Post Method";
    }
    public String putMethod(){
        return "Put Method";
    }
    public String deleteMethod(){
        return "Delete Method";
    }
}