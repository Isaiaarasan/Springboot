package com.example.demo.Modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee") // optional if table name is same
public class Employee {

   @Id
   private int id;

   private String name;

   private String department;

    private Employee() {
    }

   /**
    * @return
    */
    public static Employee createEmployee() {
        return new Employee();
    }

    // Add getters, setters, constructors
}
