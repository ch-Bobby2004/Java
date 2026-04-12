/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oops;

/**
 *
 * @author pc
 */
class Employeess {
    int id;
    String name;
    double salary;

    // Constructor (initializes object)
    Employeess(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employeess(){};

    // Method to update salary
    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to display details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------");
    }
}
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // Creating objects using constructor
        Employeess e1 = new Employeess(1, "AJ", 30000);
        Employeess e2 = new Employeess(2, "Rahul", 40000);

        // Display initial details
        e1.display();
        e2.display();

        // Updating salary
        e1.updateSalary(35000);

        // Display after update
        System.out.println("After salary update:");
        e1.display();
    }
    
}
