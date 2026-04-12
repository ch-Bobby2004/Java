/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Employee {
    int id;
    String name;
    double salary;

    // Method to set employee details
    void setDetails(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Opps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee e1 = new Employee();  // object creation

        e1.setDetails(101, "Rahul", 50000);  // setting values
        e1.displayDetails();                 // displaying values
        
        Employee e2 = new Employee();
        e2.displayDetails();
    }
    
}
