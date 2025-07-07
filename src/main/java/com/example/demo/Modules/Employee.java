package com.example.demo.Modules;

public class Employee {
   private int empID;
   private String empName;
   private String designation;

   public Employee() {
   }

   public Employee(int empID, String empName, String designation) {
      this.empID = empID;
      this.empName = empName;
      this.designation = designation;
   }

   public int getEmpID() {
      return empID;
   }

   public void setEmpID(int empID) {
      this.empID = empID;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }
}