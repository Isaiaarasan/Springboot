package com.example.demo.Modules;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

   private int empID;
   private String name;
   private String Job;


   public Employee(int i, String arasan, String king) {
   }

   public int getEmpID() {
       return 0;
   }
}
